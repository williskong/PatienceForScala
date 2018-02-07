// Provide a CryptoLogger trait that encrypts the log messages
// with the Ceasar cipher. the key should be 3 by default, but
// it should be overridable by the user. Provide usage exmples
// with the default key and a key of -3

trait CryptoLogger {
  val key = -3
}

class DefaultLogger extends CryptoLogger{
  def log(message: String): Unit ={
    for(c <- message) println(encryptLetter(c))
  }

  def encryptLetter(a: Char): Char ={
    val standA = standardize(a)
    if(standA + key > 25){
      normalize((standA + key) % 26).toChar
    }else (a.toInt + key).toChar
  }

  def standardize(l: Int): Int ={
    l - 96
  }
  def normalize(l: Int): Int ={
    l + 96
  }
}

val dl = new DefaultLogger
dl.log("zzz")