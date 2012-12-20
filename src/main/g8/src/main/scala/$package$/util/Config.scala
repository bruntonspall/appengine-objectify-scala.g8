package  $package$.util

import com.typesafe.config.ConfigFactory

object Config {
  val fallback = ConfigFactory.load()

  def get(key: String): String =
    configs.getOrElse(key, "")

  val configs = Map(
    "some.key" -> fallback.getString("some.key")
  )
}
