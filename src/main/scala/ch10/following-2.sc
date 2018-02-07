import java.io.IOException

trait ConsoleLogger {
  def log(message: String): Unit ={
    println(s"Message: $message")
  }
}

trait LoggedException extends Exception with ConsoleLogger {
  def log() { log()}
}

class UnhappyException extends LoggedException {
  override def getMessage() = "arggh!"
}

class UnhappyExceptionPlus extends IOException with LoggedException

// a self typed exception means it can only have subclasses of exception
trait LoggedExceptionThis extends ConsoleLogger{
  this: Exception =>
    def log() { log(getMessage) }
}

//structural types - types that merely specify the methods
// that a class must have, without naming the class.
trait LoggedExceptionStructural extends ConsoleLogger {
  this: { def getMessage() : String} =>
  def log() { log(getMessage())}
}

