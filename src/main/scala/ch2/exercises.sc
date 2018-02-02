/** The sugnum of a number is 1 if the
  * number is positive, -1 if it is negative
  * and 0 if it is zero.
  * Write afunction that computes this value.
  **/

def signum(n: Int) = if(n > 0) 1 else if(n ==0) 0 else -1

signum(3)
signum(-3)
signum(0)

/** What is the value of an empty block
  * expression?
  */
{}
//empty block is Unit

/** come up with one situation where the
  * assignment x = y = 1 is valid in Scala
  * Hint: Pick a suitable type for x.
  */


/** write a scala equivalent for the Java
  * Loop
  * for(int i = 10; i >= 0; i--) print i
  */

for(i <- 10 to 0 by -1) println(i)

/** write a procedure countdown(n: Int) that
  * prints the numbers from n to 0
  */

def countDown(n: Int) { for(i <- n to 0 by -1) println(i)}
countDown(10)

/** write a for loop for computing the
  * product of the unicode codes of all letters
  * in a string. eg ('Hello') is 826152896
  */

def addUni(s: String): Long = { var t: Long = 1; for(c <- s) t *= c.toInt; t}
println(addUni("Hello"))

/** write the preceding exercise without writing a loop
  * Hint: look at the StringOps ScalaDoc
  */
def addUniFold(s: String): Long = { s.foldLeft(1L)(_ * _.toInt)}
println(addUniFold("Hello"))

def product(s: String): Long = { s.foldLeft(1L)(_ * _.toInt)}

