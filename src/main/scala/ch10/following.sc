import java.io.PrintStream

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

trait FileLogger extends Logger{
  val filename: String
  val out = new PrintStream(filename)
  def log(msg: String) { out.println(msg); out.flush}
}

// early definition
val acct = new {
  val filename = "myapp.log"
} with SavingsAccount with FileLogger

val accnt = new {
  val filename = "testing123.log"
} with SavingsAccount with FileLogger

// early definition inside a class
class Savings extends {
  val filename = "savings.log"
} with Account with FileLogger {

}

// lazy value in FileLogger contructor
trait LazyFileLogger extends Logger {
  val filename: String
  lazy val out = new PrintStream(filename)
  def log(msg: String) { out.println(msg)}
}

