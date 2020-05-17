package structual.adaptor

class AppLogger extends Logger with Log {
  override def info(msg: String): Unit = log(msg, "info")

  override def debug(msg: String): Unit = log(msg, "debug")

  override def warning(msg: String): Unit = log(msg, "warning")

  override def error(msg: String): Unit = log(msg, "error")
}

class FinalAppLogger extends Log {
  val logger = new FinalLogger

  override def info(msg: String): Unit = logger.log(msg, "info")

  override def debug(msg: String): Unit = logger.log(msg, "debug")

  override def warning(msg: String): Unit = logger.log(msg, "warning")

  override def error(msg: String): Unit = logger.log(msg, "error")
}

object adaptor {
  implicit class FinalAppLoggerImplicit(logger: FinalLogger) extends Log {
    override def info(msg: String): Unit = logger.log(msg, "info")

    override def debug(msg: String): Unit = logger.log(msg, "debug")

    override def warning(msg: String): Unit = logger.log(msg, "warning")

    override def error(msg: String): Unit = logger.log(msg, "error")
  }
}