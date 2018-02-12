import java.io.File

import scala.collection.mutable._

/** Write a program that reads words from a file. Use an Sorted
  *  map to count how often each word appears. To read the words,
  *  simply use a java.util.Scanner: */


val in = new java.util.Scanner(new File("/Users/will/studies/PatienceForScala/src/main/scala/ch4/answers/02.txt"))

var freq = TreeMap[String, Int]
while(in.hasNext){
  val w = in.next
//  freq = freq + (w -> (freq.getOrElse(w, 0) + 1) )
}

for((k, v) <- freq) println(s"$k: $v")