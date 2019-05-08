package net.bigdata007.arc.network.api

object Message {

  /**
    * server message
    *
    * @param sql
    */
  case class Run(sql: String)

  /**
    * client message
    */
  case class RunResult(data: String)

}
