package $package$.model

import $package$.util.Annotations._
import com.googlecode.objectify.annotation.Entity

@Entity
case class User(
    @Id var email: String,
    @Index var password: String,
    var name: String
  ) {
  
  // Only for Objectify creation
  private def this() { this(null, null, null) }
  
}