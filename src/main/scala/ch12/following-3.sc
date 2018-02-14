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

