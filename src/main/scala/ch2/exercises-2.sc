/** Make the function of the preceding exercise a recursive function
  */
def product(s: String): Long = {
  productHelper(s, s.length, 1)
}

def productHelper(s: String, i: Int, total: Long): Long = {
  if(i==0) total
  else productHelper(s, i-1, total * s(i-1).toLong)
}

product("Hello")

// attempt without helper method
def prod(s: String, i: Int, p: Long): Long = {
  if(i == s.length) p
  else prod(s, i+1, p * s(i).toInt)
}

prod("Hello", 0, 1)


def xpown(x: BigDecimal, n: Int): BigDecimal = {
  if (n == 0) 1
  else if (n < 0) 1 / xpown(x, -n)
  else if (n % 2 == 0) {
    val i = xpown(x, n / 2)
    i * i
  }
  else x * xpown(x, n - 1)
}