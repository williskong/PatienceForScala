for(c <- "Hello"; i <- 0 to 1) yield (c + i).toChar

for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar

def abs(x: Double) = if (x >= 0) x else -x

def fac(n: Int) = {
  var r = 1
  for(j <- 1 to n) r = r * j
  r
}

fac(2)

def facRecursive(n: Int): Int = if (n <= 0) 1 else n * facRecursive(n - 1)

facRecursive(4)

def decorate(str: String, left: String = "[", right: String = "]") =
left + str + right

decorate("hello", "<<<", ">>>")

def sum(args: Int*) = {
  var result = 0
  for(arg <- args) result += arg
  result
}

val s = sum(1, 2, 3, 4, 5)

// to consider 1 to 5 as an argument sequence append _*
val r = sum(1 to 5: _*)

def box(s: String) {
  val border = "-" * s.length + "--\n"
  println(border + "|" + s + "|\n" + border)
}

box("hello")

val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString
//evaluated as soon as words is defined

lazy val lazyWords = scala.io.Source.fromFile("usr/share/dict/words").mkString
//evaluated the first time it's used

def defWords = scala.io.Source.fromFile(("usr/share/dict/words").mkString)
//evaluated everytime it's used

