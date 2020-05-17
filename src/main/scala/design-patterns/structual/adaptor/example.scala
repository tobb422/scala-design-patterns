package structual.adaptor

object example {
  def main(args: Array[String]): Unit = {
    val logger = new AppLogger
    logger.info("aaa")
    logger.debug("aaa")
    logger.warning("aaa")
    logger.error("aaa")
  }
}

object adaptor {
  implicit class FinalAppLoggerImplicit(logger: FinalLogger) extends Log {
    override def info(msg: String): Unit = logger.log(msg, "info")

    override def debug(msg: String): Unit = logger.log(msg, "debug")

    override def warning(msg: String): Unit = logger.log(msg, "warning")

    override def error(msg: String): Unit = logger.log(msg, "error")
  }

  def main(args: Array[String]): Unit = {
    val logger: Log = new FinalLogger

    logger.info("aaa")
    logger.debug("aaa")
    logger.warning("aaa")
    logger.error("aaa")
  }
}
