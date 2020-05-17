package mastergingAdvanced.features

case class Person(name: String) {
  def greet: String = s"Hello, I'm $name"
}

object Person {
  implicit val person: Person = Person("User")
  def sayHello(implicit person: Person): String = s"Hello, ${person.name}"

  // implicit def stringToPerson(str: String): Person = Person(str)
  // ショットカット的な書き方
  implicit class StringToPerson(str: String) {
    def greet: String = s"Hello, I'm $str"
  }
}

object Example {
  def main(args: Array[String]): Unit = {
    Person.sayHello // 自動で implicit val person: Person = Person("User") が引数に渡される

    import Person._
    "Joe".greet // stringToPerson が呼ばれ,greet が使用可能になる
  }
}
