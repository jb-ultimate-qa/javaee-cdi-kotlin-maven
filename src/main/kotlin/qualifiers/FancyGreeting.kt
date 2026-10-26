package qualifiers

import javax.inject.Named

@Named("fancy")
open class FancyGreeting : Greeting {
  override fun greet(): String = "Good day to you"
}
