/**  Set up a map of prices for a number of gizmos that you
  *  covet. Then produce a second map with the same keys
  *  and the prices at a 10 percent discount. */

var gizmos = Map("Wing Zero" -> 35.00, "Heavy Arms" -> 30.00, "Burning" -> 35.00)

for((k, v) <- gizmos) yield (k, v * .9)
