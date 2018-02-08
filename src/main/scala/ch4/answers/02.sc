import java.io.File
import scala.collection.mutable.HashMap
/** Write a program that reads words from a file. Use a mutable
  *  map to count how often each word appears. To read the words,
  *  simply use a java.util.Scanner: */


val in = new java.util.Scanner(new File("/Users/will/studies/PatienceForScala/src/main/scala/ch4/answers/02.txt"))

var counts: HashMap[String, Int] = new HashMap
while(in.hasNext){
  val w = in.next
  counts(w) = counts.getOrElse(w, 0) + 1
}

counts += ("hello" -> 1)
for((k, v) <- counts) println(s"$k: $v")