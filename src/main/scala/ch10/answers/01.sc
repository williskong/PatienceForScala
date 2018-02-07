// The java.awt.Rectangle class has useful methodsds translate and grow
// that are unfortunately absent from classes such as
// java.awt.geom.Ellipse2D. In Scala, you can fix this problem. Define
// a trait RectangleLike with concrete methods translate and grow.
// Provide any abstract methods that you need for implementation, so
// that you can mix in the train like this:
// val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
// egg.translate(10, -10)
// egg.grow(10, 20)

trait RectangleLike {
  def translate(x: Int, y: Int){
    println(s"moving x: $x and y: $y")
  }
  def grow(x: Int, y: Int){
    println(s"growing ${x * y} outwards!")
  }
}

val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
egg.translate(2, 3)
egg.grow(3, 4)
