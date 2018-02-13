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


class Point(var x: Double = 0, var y: Double =0){
  override def toString = (s"{$x, $y}")
  def translate(x: Double, y: Double){
    this.x += x; this.y += y
  }
}

def nSquareAway(translateAmount: Double) =
  (x: Double, y: Double) => new Point(x + translateAmount, y + translateAmount)

val newFive = nSquareAway(5)
val p = new Point
val p2 = newFive(p.x, p.y)

def translatePoint(moveX: Double, moveY: Double) =
  (p: Point) => p.translate(moveX, moveY)

val moveTen = translatePoint(10, 10)
moveTen(p)
p
moveTen(p)
p


