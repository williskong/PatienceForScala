import scala.collection.mutable.ArrayBuffer

// write a code snippet that sets a to an array
// of n random integers between 0(inclusive and
// n (exclusive)
val r = scala.util.Random
val n = 10
var b = ArrayBuffer[Int]()
for(i <- 0 until n) b.append(r.nextInt(10))
b.toArray

val x = for(i <- 0 until n) yield r.nextInt(10)
x.toArray

// write a loop that swaps adjacent elements of
// an array of integers.
// eg (1, 2, 3, 4, 5) -> (2, 1, 4, 3, 5)
val max = if(b.length % 2 > 0) b.length-2 else b.length-1
for(i <- 0 until max by 2) (b(i), b(i+1)).swap

b.toArray
