package traits

trait Alarm {
  // インターフェースとしての定義
  def trigger(): String
}

trait Notifier {
  val notificationMsg: String

  // 実装済みのメソッドを持つこともできる
  def printNotification(): Unit = {
    System.out.println(notificationMsg)
  }

  def clear()
}

// notificationMsg は、自動的に override される
class NotifierImpl(val notificationMsg: String) extends Notifier {
  override def clear(): Unit = System.out.println("cleared")
}
