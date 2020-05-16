package structual.adaptor

class Logger {
  def log(msg: String, severity: String): Unit = {
    System.out.println(s"${severity.toUpperCase}: $msg")
  }
}

final class FinalLogger {
  def log(msg: String, severity: String): Unit = {
    System.out.println(s"${severity.toUpperCase}: $msg")
  }
}
