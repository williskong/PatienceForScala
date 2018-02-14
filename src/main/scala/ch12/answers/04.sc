/** 4. The previous implementation needed a special case when n < 1.
  * Show how you can avoid this with foldLeft. (Look at the Scaladoc
  * for foldLeft. It’s like reduceLeft, except that the first value
  * in the chain of combined values is supplied in the call.)*/


def foldFact(n: Int) = (1 to n).foldLeft(1)( (a, b) => a * b )

foldFact(5)

def foldFactorial(n: Int) = (1 to n).foldLeft(1)( (a, b) => a * b)
foldFactorial(5)
