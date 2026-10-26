package scopes

import javax.enterprise.context.RequestScoped

@RequestScoped
open class MyRequestScopedBean {
  open val id: String
    get() = toString()
}
