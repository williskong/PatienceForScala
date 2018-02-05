// how do you compute the average of an Array[Double]
import scala.util.Random
val random = Random
val s = for(i <- 0 until 10) yield random.nextDouble()
s.sum / s.length

// how do you rearrange the elements of an Array[Int]
// so that they appear in reverse sorted order? How do
// you do the same with an ArrayBuffer[Int]?

