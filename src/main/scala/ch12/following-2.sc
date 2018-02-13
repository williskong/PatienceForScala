def mulBy(factor: Double) = (x: Double) => factor * x
val triple = mulBy(3)
val half = mulBy(.5)
println(s"${triple(14)} ${half(14)}")

def addN(factor: Double) = (x: Double) => factor + x
val addTwo = addN(2)
println(addTwo(5))

def powerOf(factor: Double) = (x: Double) => Math.pow(x, factor)
val powerOfTwo = powerOf(2)
println(powerOfTwo(3))


class Point(val x: Double = 0, val y: Double =0){
  override def toString = (s"{$x, $y}")
}

def translate(translateAmount: Double) =
  (x: Double, y: Double) => new Point(x + translateAmount, y + translateAmount)

val moveFive = translate(5)
val p = new Point
val p2 = moveFive(p.x, p.y)