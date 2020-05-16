package creational.factoryMethod

object example {
  def main(args: Array[String]): Unit = {
    val clientMysql: DatabaseClient = new MysqlClient
    val clientPgSql: DatabaseClient = new PgSqlClient

    clientMysql.executeQuery("select * from users")
    clientPgSql.executeQuery("select * from users")
  }
}
