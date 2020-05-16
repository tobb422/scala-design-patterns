package traits

// 複数の Trait を Mixin できる
object Mixing extends Ping with Pong {
  def main(args: Array[String]): Unit = {
    ping()
    pong()
  }
}
