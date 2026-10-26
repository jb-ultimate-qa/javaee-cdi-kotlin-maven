package injection

import javax.inject.Inject

open class SingleUseClient {
  @Inject lateinit var singleUseBean: SingleUseBean
}
