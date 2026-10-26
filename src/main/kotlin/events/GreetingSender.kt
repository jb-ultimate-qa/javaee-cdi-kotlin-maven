package events

import javax.enterprise.event.Event
import javax.inject.Inject

open class GreetingSender : EventSender {
  @Inject
  private lateinit var event: Event<String>

  override fun send(message: String) {
    event.fire(message)
  }
}
