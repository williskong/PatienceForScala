import scala.collection.mutable.ArrayBuffer

// write a code snippet that sets a to an array
// of n random integers between 0(inclusive and
// n (exclusive)
val r = scala.util.Random
val n = 10
var b = ArrayBuffer[Int]()
for(i <- 0 until n) b.append(r.nextInt(10))
b.append(-10)
b.toArray

val x = for(i <- 0 until n) yield r.nextInt(10)
x.toArray

// write a loop that swaps adjacent elements of
// an array of integers.
// eg (1, 2, 3, 4, 5) -> (2, 1, 4, 3, 5)
val max = if(b.length % 2 > 0) b.length-1 else b.length
val xz = for(i <- 0 until max by 2) (b(i), b(i+1)).swap

// write the preceding, but yielding a new array
b.toArray
val bx = for(i <- 0 until max) yield if(i == 0 || i % 2 ==0) b(i+1) else (b(i-1))
bx.toArray

// Given an array of integers, produce a new
// array that contains all positive
// values of the original array, in their
// original order, followed by all values
// that are zero or negative, in their original order.

for(bd <- b) yield if(bd > 0) bd 