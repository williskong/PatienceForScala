import scala.math._

val num = 3.14
val fun = ceil _

println(fun(num))

//without underscore
val f: (Double) => Double = ceil

val _getChar = (_:String).charAt(_:Int)

_getChar("Hello", 3)

//without the underscore
val getChar: (String, Int) => Char = _.charAt(_)


//passing the define function as a variable
Array(3.14, 1.42, 2.0).map(fun)


//anonymous function
(x: Double) => 3 * x


//passing anonymous function
Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x).map(x => f(x))

def valueAtOneQuarter(f: (Double) => Double) = f(0.25)
valueAtOneQuarter(ceil _)
valueAtOneQuarter(sqrt _)
valueAtOneQuarter(_ * 30)
valueAtOneQuarter(x => x * 30)

def mulBy(factor: Double) = (x: Double) => factor * x
val quintuple = mulBy(5)
quintuple(5)

valueAtOneQuarter((x) => 3 * x)

