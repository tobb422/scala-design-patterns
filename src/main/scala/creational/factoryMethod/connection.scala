package creational.factoryMethod

trait SimpleConnection {
  def getName: String

  def executeQuery(query: String): Unit
}

class SimpleMysqlConnection extends SimpleConnection {
  override def getName: String = "Mysql"

  override def executeQuery(query: String): Unit = {
    System.out.println(s"Executing the query '$query' the Mysql way.")
  }
}

class SimplePgSqlConnection extends SimpleConnection {
  override def getName: String = "PgSql"

  override def executeQuery(query: String): Unit = {
    System.out.println(s"Executing the query '$query' the PgSql way.")
  }
}