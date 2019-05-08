package org.apache.spark.sql.execution.datasources.hbase

import java.io.{File, FileInputStream}
import java.security.PrivilegedAction

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.{FileSystem, Path}
import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.security.UserGroupInformation

object ConfUtil {

  def init(hc: Configuration = HBaseConfiguration.create(), options: Map[String, String]): Configuration = {
    val hdfsFile = if ("kerberos".equals(hc.get("hbase.security.authorization"))) {
      UserGroupInformation.setConfiguration(hc)
      val ugi = UserGroupInformation.loginUserFromKeytabAndReturnUGI(hc.get("hbase.kerberos.principal"), hc.get("hbase.kerberos.keytab"))
      ugi.doAs[FileSystem](new PrivilegedAction[FileSystem]() {
        override def run(): FileSystem = {
          FileSystem.get(hc)
        }
      })
    } else {
      FileSystem.get(hc)
    }

    val hdfsMatch = "(hdfs://.*)".r
    options.foreach(p => {
      if (p._1.startsWith("hbase.conf.file")) {
        p._2.split(",", -1).foreach {
          path => {
            val is = hdfsMatch findFirstIn path match {
              case Some(s) =>
                hdfsFile.open(new Path(s)).getWrappedStream
              case None =>
                new FileInputStream(new File(path))
            }
            hc.addResource(is)
          }
        }
      }
    })
    hc
  }

}
