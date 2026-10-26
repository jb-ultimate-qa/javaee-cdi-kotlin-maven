package producers

import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Disposes
import javax.enterprise.inject.Produces

@ApplicationScoped
open class ConnectionProducer {
  @Produces
  open fun createConnection(): Connection = object : Connection {
    override fun url(): String = "jdbc:test"
  }

  open fun closeConnection(@Disposes connection: Connection) {
  }
}
