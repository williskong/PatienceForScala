val mul = (x: Int, y: Int) => x * y

mul(2, 3)

//currying one value into the next function
val mulOneAtATime = (x: Int) => ((y:Int) => x * y)
mulOneAtATime(6)(7)

//short hand for currying
def mulOneAtATimeSh(x: Int)(y: Int) = x * y
mulOneAtATimeSh(6)(7)

val a = Array("Hello", "World")
val b = Array("hello", "world")
a.corresponds(b)(_.equalsIgnoreCase(_))
//def corresponds[B](that: Seq[B])(p: (A, B) => Boolean): Boolean

def runInThread(block: => Unit) {
  new Thread {
    override def run() {block}
  }.start()
}

//runInThread{ println("HI"); Thread.sleep(5000); println("Bye")}


//call by name parameter
def until(condition: => Boolean)(block: => Unit){
  if(!condition){
    block
    until(condition)(block)
  }
}

var x = 10
until(x == 0){
  x -= 1
  println(x)
}

