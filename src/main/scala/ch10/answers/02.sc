import java.awt.Point
// Define a class OrderedPoint by mixing scala.math.Ordered[Point] into java.awt.Point
// Use lexicographic ordering, i.e. (x, y) < (x', y') if x < x' and y < y'

class OrderPoint extends Point with scala.math.Ordered[Point] {
  override def compare(that: Point) {
    if(x < that.x && y < that.y)
      x
    else that
  }
}