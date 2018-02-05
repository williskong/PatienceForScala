import scala.collection.mutable.ArrayBuffer

val d = ArrayBuffer[Int](2, 3, 4, 5, 6, 7)

d.filter(_ % 2 == 0).map(2 * _)

d.filter(_ % 2 == 0).map(2 * _)



var first = true
var n = d.length
var i = 0
//while(i < n){
//  if(d(i) >= 0) i+= 1
//  else {
//    if(first) { first = false; i += 1}
//    else { d.remove(i); n-=1}
//  }
//}

d.toArray

val a = ArrayBuffer[Int](2, 3, -2, 4, 5, 6, 7)
val indexes = for(i <- 0 until a.length if (i) < 0) yield i


for(j <- (1 until indexes.length).reverse) a.remove(indexes(j))
println(a)

Array(1, 7, 2, 9).sum

ArrayBuffer("Mary", "had", "a", "little", "lamb").max

val z = ArrayBuffer(1, 7, 2, 9)
val bSorted = z.sorted

val az = Array(1, 7, 2, 9)
scala.util.Sorting.quickSort(az)
az

az.mkString
