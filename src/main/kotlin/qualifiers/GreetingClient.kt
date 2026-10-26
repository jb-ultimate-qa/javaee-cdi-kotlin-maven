package qualifiers

import javax.inject.Inject
import javax.inject.Named

open class GreetingClient {
  @Inject @field:Named("fancy") lateinit var fancyGreeting: Greeting
}
