/** 3. Implement the factorial function using
  * to and reduceLeft, without a loop or recursion. */


def factorial(n: Int) = (1 to n).reduceLeft( (a, b) => a * b)

factorial(5)



def foldFactAgain(n: Int) = (n to 1).foldLeft(1)((a,b) => a * b)

foldFactAgain(5)