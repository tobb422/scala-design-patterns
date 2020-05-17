package creational.abstractFactory

trait DatabaseConnectorFactory {
  def connect(): SimpleConnection
}

class MysqlConnectorFactory extends DatabaseConnectorFactory {
  override def connect(): SimpleConnection = new SimpleMysqlConnection
}

class PgSqlConnectorFactory extends DatabaseConnectorFactory {
  override def connect(): SimpleConnection = new SimplePgSqlConnection
}
