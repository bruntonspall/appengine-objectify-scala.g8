package $package$.servlets

import org.scalatra.ScalatraServlet
import $package$.scalatra.TwirlSupport
import $package$.model.User
import $package$.util.Ofy

class DispatcherServlet extends ScalatraServlet with TwirlSupport {

  get("/") {
    val userToSave = new User("test@test.com", "password", "Testy Testerson")
    Ofy.save.entity(userToSave).now()
    val user = Ofy.load.`type`(classOf[User]).id("test@test.com").get
    html.welcome.render(user)
  }

}