package org.apache.spark.sql.execution.datasources.hbase

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.hbase.client.{Connection, ConnectionFactory, Table}
import org.apache.hadoop.hbase.{HBaseConfiguration, TableName}

object HbaseConnectionUtil {
  var conn: Connection = _
  def apply(conf: Configuration, tableName: String): Table = synchronized {
    if (null == conn) {
      conn = ConnectionFactory.createConnection(HBaseConfiguration.create(conf))
    }
    conn.getTable(TableName.valueOf(tableName))
  }
}
