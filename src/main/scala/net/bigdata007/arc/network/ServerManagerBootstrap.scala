package net.bigdata007.arc.network
import akka.actor._
import com.typesafe.config.{ConfigFactory}

object ServerManagerBootstrap {

  def main(args: Array[String]): Unit = {
    val str: String =
      """
        |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
        |akka.actor.warn-about-java-serializer-usage = off
        |akka.remote.netty.tcp.hostname = localhost
        |akka.remote.netty.tcp.port = 20000
      """.stripMargin
    val conf = ConfigFactory.parseString(str)
    val actorSystem = ActorSystem("ServerResourceManager", conf)
    actorSystem.actorOf(Props(new ServerResourceManager()), "ServerResourceManagerActor")
  }
}
