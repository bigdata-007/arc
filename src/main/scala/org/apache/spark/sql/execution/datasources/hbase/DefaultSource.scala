package org.apache.spark.sql.execution.datasources.hbase

import org.apache.spark.internal.Logging
import org.apache.spark.rdd.RDD
import org.apache.spark.spark._
import org.apache.spark.sql.sources._
import org.apache.spark.sql.types._
import org.apache.spark.sql._

class DefaultSource extends CreatableRelationProvider with RelationProvider with DataSourceRegister {

  override def createRelation(sqlContext: SQLContext, parameters: Map[String, String]): BaseRelation =
    HBaseRelation(parameters)(sqlContext)

  override def shortName(): String = "hbase"

  override def createRelation(sqlContext: SQLContext, mode: SaveMode, parameters: Map[String, String], data: DataFrame): BaseRelation = {
    val relation = InsertHBaseRelation(data, parameters)(sqlContext)
    relation.insert(data, parameters.getOrElse("savemodel", "false").toBoolean)
    relation
  }
}

private[sql] case class InsertHBaseRelation(
                                             dataFrame: DataFrame,
                                             parameters: Map[String, String]
                                           )(@transient val sqlContext: SQLContext)
  extends BaseRelation with InsertableRelation with Logging {


  override def insert(data: DataFrame, overwrite: Boolean): Unit = {

    def getOutputTableName: String = parameters.getOrElse("hbase.table.name", sys.error("You must specify parameter hbase.table.name..."))

    data.saveToHbase(getOutputTableName, parameters)
  }

  override def schema: StructType = dataFrame.schema


}

private[sql] case class HBaseRelation(parameters: Map[String, String])(@transient val sqlContext: SQLContext)
  extends BaseRelation with TableScan with Logging {

  def getZkURL: String = parameters.getOrElse("hbase.zookeeper.quorum", "localhost:2181")

  def getInputTableName: String = parameters.getOrElse("hbase.table.name", sys.error("You must specify parameter hbase.table.name..."))

  def buildScan(): RDD[Row] = {
    if (parameters.contains("org.apache.spark.rowkey.view.name")) {
      val df = sqlContext.sparkSession.sql("select * from " + parameters("org.apache.spark.rowkey.view.name"))
      sqlContext.sparkSession.rowkey(df).hbaseTableAsDataFrame(getInputTableName, Some(getZkURL), parameters).rdd
    } else {
      sqlContext.sparkSession.hbaseTableAsDataFrame(getInputTableName, Some(getZkURL), parameters).rdd
    }
  }

  override def schema: StructType = {
    sqlContext.sparkSession.hbaseTableAsDataFrame(getInputTableName, Some(getZkURL), parameters).schema
  }

}
