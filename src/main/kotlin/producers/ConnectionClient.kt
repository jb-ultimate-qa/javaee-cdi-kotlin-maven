package producers

import javax.inject.Inject

open class ConnectionClient {
  @Inject lateinit var injectedConnection: Connection
}
