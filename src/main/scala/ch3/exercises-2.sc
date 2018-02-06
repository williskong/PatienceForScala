// how do you compute the average of an Array[Double]
import scala.collection.mutable.Buffer
import collection.JavaConverters.asScalaBuffer
import scala.util.Random
val random = Random
val s = for(i <- 0 until 10) yield random.nextDouble()
s.sum / s.length

// how do you rearrange the elements of an Array[Int]
// so that they appear in reverse sorted order? How do
// you do the same with an ArrayBuffer[Int]?

val t = for(_ <- 0 until 10) yield random.nextInt(10)
t.sorted
val x = t.sorted.reverse

// write a code snippet that produces all values from
// an array with duplicates removed

val m = for(_ <- 0 until 10) yield random.nextInt(10)
m.distinct

// rewrite the example at the end of Section 3.4
// transforming arrays - using drop method for first
// match
val a = for(_ <- 0 until 10) yield random.nextInt(10)
var first = true
var n = a.length
var i = 0
while (i < n) {
  if (a(i) >= 0) i += 1
  else {
    if (first) { first = false; i += 1 }
    else { a.drop(i); n -= 1 }
  }
}
a.toString
a.drop(3)
a.dropRight(3)
a.dropWhile(_ > 9)
a.dropWhile(_ * 5 % 3 == 1)


// Make a collection of all time zones returned by
// java.util.Timezone.getAvailableIDS that are in
// America. Strip off the America prefix and sort
// the result

// 60 - 223
val timeZones = java.util.TimeZone.getAvailableIDs()
val extractedZones = for(i <- 60 until 223) yield timeZones(i)
val prefix = "America/"
for(i <- 60 until 223) yield timeZones(i).drop(prefix.length)

import java.awt.datatransfer._
val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]

import scala.collection.JavaConverters
val buffer = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
val converted: Buffer[String] = asScalaBuffer(buffer)

println(converted)