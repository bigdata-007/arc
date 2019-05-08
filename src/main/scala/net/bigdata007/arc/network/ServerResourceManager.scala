package net.bigdata007.arc.network

import akka.actor.Actor
import net.bigdata007.arc.antlr4.{ArcSQLLexer, ArcSQLParser}
import net.bigdata007.arc.listener.SQLExecListener
import net.bigdata007.arc.network.api.Message
import net.bigdata007.arc.network.api.Message.RunResult
import net.bigdata007.arc.util.ArcContext
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.col

class ServerResourceManager extends Actor {

  System.setProperty("java.security.krb5.conf", "/etc/krb5.conf")
  val SPARK = SparkSession
    .builder()
    .master("local")
    .appName("arc")
    .getOrCreate()


  override def postStop(): Unit = {
    SPARK.stop()
  }

  override def preStart(): Unit = {
//    val loadLexer = new ArcSQLLexer(CharStreams.fromString(

//    val tokens = new CommonTokenStream(loadLexer)
//    val parser = new ArcSQLParser(tokens)
//    val stat = parser.multiStatement()
//    val listener = new SQLExecListener(spark)
//    ParseTreeWalker.DEFAULT.walk(listener, stat)
  }

  override def receive: Receive = {
    case Message.Run(sql:String) =>
      println("run sql => " +sql)
      val nodeSparkSession = SPARK.newSession()
      val loadLexer = new ArcSQLLexer(CharStreams.fromString(sql))
      val tokens = new CommonTokenStream(loadLexer)
      val parser = new ArcSQLParser(tokens)
      val stat = parser.multiStatement()
      val listener = new SQLExecListener(nodeSparkSession)
      ParseTreeWalker.DEFAULT.walk(listener, stat)
      sender() ! RunResult("finish")
      val showTableName = "showTable_"
      ArcContext.all()
        .keySet
        .filter(_.startsWith(showTableName))
        .map(_.substring(showTableName.length))
        .foreach {
          tableName => {
            val showTable = SPARK.table(tableName)
            showTable.select(showTable.columns.map(col): _*)
              .show(false)
          }
        }
//      nodeSparkSession.stop() //TODO stop has problem ,because the task not finished and it stop
  }
}
