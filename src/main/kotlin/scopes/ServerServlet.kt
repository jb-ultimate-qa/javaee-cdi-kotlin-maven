package scopes

import javax.inject.Inject
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(urlPatterns = ["/ServerServlet"])
open class ServerServlet : HttpServlet() {
  @Inject lateinit var requestBean: MyRequestScopedBean
  @Inject lateinit var requestBean2: MyRequestScopedBean

  override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
    response.writer.println(requestBean.id + " " + requestBean2.id)
  }
}
