import scala.collection.mutable.ArrayBuffer

val nums = new Array[Int](10)

val a = new Array[String](10)

val s = Array("Hello", "World")

s(0) = "Goodbye"

val numbers = Array(10, 20, 30, 40, 50)

numbers(0) = 60

numbers

val friends = Array("Joe", "Larry",
  "Hen", "Lou", "lung")

val family = ArrayBuffer[String]()

family ++= Array("Mom", "Dad", "Sister")

family ++= friends

println(family)

val b = ArrayBuffer[Int]()
//same as arraylist(java) & vectors(c++) resizing arrays
b += 1
b += (1, 2, 3, 4, 5)

b.toArray
b.trimEnd(1)
b.toArray

b.insert(2, 6)
//insert at index 2 and index 2 -> 3
b.toArray

b.remove(2)
// removing value at index 2

b.remove(2, 2)
b.toArray

b.toArray

a.toBuffer

for(j <- 0 until s.length)
  println(j + ": " + s(j))

