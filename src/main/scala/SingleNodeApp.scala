import akka.actor.{ActorSystem, Props}
import com.me.finalization.{DecidersGuardian, RestService}

/**
  * Created by puspendu on 8/1/16.
  */
object SingleNodeApp extends App {
  implicit val system = ActorSystem("sorter")
  val deciderGuardian = system.actorOf(Props[DecidersGuardian])
  system.actorOf(Props(classOf[RestService], deciderGuardian, 8080), "restservice")
}