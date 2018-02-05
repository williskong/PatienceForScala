import scala.collection.mutable.ArrayBuffer

val a = ArrayBuffer(2, 3, 1, 6)

a += (4, 5, 7)
a.toArray.sorted

a.padTo(10, 1).toArray.mkString


// 3 rows 4 columns
val matrix = Array.ofDim[Double](3, 4)

val triangle = new Array[Array[Int]](10)
for(i <- 0 until triangle.length)
  triangle(i) = new Array[Int](i + 1)

val command = ArrayBuffer("ls", "-al", "/home/cay")

val numbers= List(5, 4, 8, 6, 2)
numbers.fold(0) {(z, i) => z + i}

