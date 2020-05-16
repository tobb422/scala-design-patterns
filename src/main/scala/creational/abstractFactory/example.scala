package creational.abstractFactory

object example {
  def main(args: Array[String]): Unit = {
    val clientMysql: DatabaseClient = new DatabaseClient(new MysqlConnectorFactory)
    val clientPgSql: DatabaseClient = new DatabaseClient(new PgSqlConnectorFactory)

    clientMysql.executeQuery("select * from user")
    clientPgSql.executeQuery("select * from user")
  }
}
