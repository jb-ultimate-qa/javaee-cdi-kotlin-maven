package inspections

import javax.inject.Inject
import qualifiers.Greeting

open class InjectionProblems {
  @Inject lateinit var missingService: MissingService
  @Inject lateinit var anyGreeting: Greeting
}
