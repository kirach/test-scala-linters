package example

object Hello extends Greeting with App {
  val option: Option[String] = Some("test")
  println(s"Option content is: ${option.get}")
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
