package traits

class Watch(brand: String, initialTime: Long) {
  def getTime: Long = System.currentTimeMillis() - initialTime
}

object WatchUser {
  def main(args: Array[String]): Unit = {
    val expensiveWatch = new Watch("expensive brand", 1000L) with Alarm with Notifier {
      override val notificationMsg: String = "Alarm is running!"
      override def trigger(): String = "this alarm was triggered."
      override def clear(): Unit = System.out.println("Alarm cleared")
    }

    val cheapWatch = new Watch("cheap brand", 1000L) with Alarm {
      override def trigger(): String = "this alarm was triggered."
    }

    System.out.println(expensiveWatch.trigger())
    expensiveWatch.printNotification()
    System.out.println(s"The time is ${expensiveWatch.getTime}.")
    expensiveWatch.clear()

    System.out.println(cheapWatch.trigger())
    System.out.println("Cheap watches cannot manually stop the alarm...")
  }
}
