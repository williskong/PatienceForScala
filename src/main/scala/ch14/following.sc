

val arr = Array(0, "s")

arr match {
  case Array(o) => "o"
  case Array(x, y) => s"$x $y"
  case Array(o, _*) => "o ...."
  case _ => "something else"
}

val list = List[String]("o", "sexy", "flanders")
list match {
  case o :: Nil => "o"
  case x :: y :: Nil => s"$x $y"
  case o :: tail => "o..."
  case _ => "something else"
}

val x = ((1, 2),(3,4))

val pattern = "([0-9]+)([a-z]+)".r

"99 bottles" match {
  case pattern(num, item) => println(s"$num $item")
  case _ => println("didn't work")
}

// /% returns the quotient and the remainder
val (g, r) = BigInt(10) /% 3
val (xz, yz) = (1, 2)

val Array(first, second, rest @ _*) = arr
// assigns the first and second element of the
// array arr to the variables first and second and
// rest to a Seq of the remaining elements.

abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, Unit: String) extends Amount

case object Nothing extends Amount

val amt: Amount = Dollar(5.0)
val amt2: Amount = Currency(5.0, "NPL")

amt2 match {
  case Dollar(v) => s"$$$v"
  case Currency(_, u) => s"Oh noes, I got $u"
  case Nothing => ""
}

// copy can create copy and reassign named parameters

// case first :: second :: rest
// is the same as
// case ::(first, ::(second, rest))
