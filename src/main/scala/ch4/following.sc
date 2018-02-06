import scala.collection.mutable

val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

val mutableScores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

val hmScores = new mutable.HashMap[String, Int]

val bobScore = scores("Bob")

if(scores.contains("Bob")) scores("Bob") else 0


