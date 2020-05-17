package structual.adaptor

trait Log {
  def info(msg: String)
  def debug(msg: String)
  def warning(msg: String)
  def error(msg: String)
}
