import java.io.File
import scala.collection.mutable.Map
/** Write a program that reads words from a file. Use a mutable
  *  map to count how often each word appears. To read the words,
  *  simply use a java.util.Scanner: */


val in = new java.util.Scanner(new java.io.File("02.txt"))

var counts: scala.collection.mutable.HashMap[String, Int]
while(in.hasNext){
  val w = in.next
  counts.getOrElse(w.toString, 0)
  counts(w) += 1
}
