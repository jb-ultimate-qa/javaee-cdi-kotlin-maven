package events

import java.io.Serializable
import javax.enterprise.context.SessionScoped
import javax.enterprise.event.Observes

@SessionScoped
open class GreetingReceiver : EventReceiver, Serializable {
  override var greet: String = "Willkommen"

  open fun receive(@Observes greeting: String) {
    greet = greeting
  }
}
