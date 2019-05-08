package net.bigdata007.arc.listener

import org.apache.spark.internal.Logging
import org.apache.spark.scheduler._
import scala.collection.mutable


case class JobInfo(totalTask: Int, finishTask: Int, percent: Int) {
  def update(finishTask: Int, percent: Int): JobInfo = JobInfo(totalTask, finishTask, percent)
}

class SparkAppListener(jobNum: Int) extends SparkListener with Logging {

  private val jobInfos = new mutable.HashMap[Int, JobInfo]()
  private val stageMapJobs = new mutable.HashMap[Int, Int]()
  private var finishJobNum = 0

  override def onApplicationStart(applicationStart: SparkListenerApplicationStart): Unit = {
    val appId = applicationStart.appId.get
  }

  override def onJobStart(jobStart: SparkListenerJobStart): Unit = synchronized {
    val jobId = jobStart.jobId
    val tasks = jobStart.stageInfos.map(_.numTasks).sum
    jobInfos += (jobId -> JobInfo(tasks, 0, 0))
    jobStart.stageIds.foreach {
      id => stageMapJobs(id) = jobId
    }
  }


  override def onTaskEnd(taskEnd: SparkListenerTaskEnd): Unit = synchronized {
    val jobId = stageMapJobs(taskEnd.stageId)
    val stageId = taskEnd.stageId
    val jobInfo = jobInfos(jobId)
    val finishTaskNum = jobInfo.finishTask + 1
    val newPercent = finishTaskNum * 100 / (jobInfo.totalTask * jobNum)
    jobInfos(jobId) = jobInfo.update(finishTaskNum, newPercent)
    val totalPercent = jobInfos.values.map(_.percent).sum
    logInfo(s"finish percent $totalPercent%")
  }

  override def onJobEnd(jobEnd: SparkListenerJobEnd): Unit = {
    jobEnd.jobResult match {
      case JobSucceeded => finishJobNum += 1
//      case JobFailed(exception) => logError(exception.getMessage)
      case default@_ => println(default)
    }
  }

  override def onApplicationEnd(applicationEnd: SparkListenerApplicationEnd): Unit = {
    val totalJobNum = jobInfos.keySet.size
    val totalPercent = jobInfos.values.map(_.percent).sum
  }
}