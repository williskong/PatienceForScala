
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

import scala.collection.JavaConverters.asScalaBuffer
import scala.collection.mutable.Buffer
val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]

val buffer = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
val converted: Buffer[String] = asScalaBuffer(buffer)

println(converted)

