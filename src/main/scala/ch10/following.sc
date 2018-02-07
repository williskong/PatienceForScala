trait Logger {
  def log(msg: String)
  def info(msg: String) { log(s"INFO: $msg")}
  def warn(msg: String) { log(s"WARN: $msg")}
  def severe(msg:String) { log(s"WARN: $msg")}
}

trait ShortLogger extends Logger {
  val maxLength = 25 // concrete field
  override def log(msg: String){
    super.log{
      if(msg. length <= maxLength) msg
      else s"${msg.substring(0, maxLength - 3)}..."
    }
  }
}

trait ConsoleLogger {

}

class Account{
  var balance = 0.0
}

class SavingsAccount extends Account with ConsoleLogger with ShortLogger {
  var interest = 0.0
  def withdraw(amount: Double): Unit ={
    if(amount > balance) log("insufficient funds")
    else log(s"withdrawing $amount")
  }
}

