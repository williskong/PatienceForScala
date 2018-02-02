
val x = 0

if (x > 0) 1 else -1

val s = if (x > 0) 1 else -1
//better - evaluated before referenced, so we can use a val

var r = 0
var n = 10
if (n > 0) {r = r * n; n-= 1}

val name = "willis"
val age = 27
print(f"Hello, $name! In six months you'll be ${age + 0.5}%7.2f years old. %n")

n = 10
var rs: Int = 2
for (i <- 1 to n){
  print(rs * i + " ")
}


val hello = "Hello"
var sum = 0
for(i <- 0 to hello.length - 1)
  sum += hello(i)

sum = 0
for (ch <- hello) sum += ch
sum

for (i <- 1 to 3; j <- 1 to 3) print(f"i is $i and j is $j")
//same as a nested for loop

for (i <- 1 to 3; j <- 1 to 3 if i != j) println(f"${10 * i +j}%d")
// is the same as
for (i <- 1 to 3)
  for(j <- 1 to 3)
    if(i != j)println(f"${10 * i + j}%d")

for (i <- 1 to 3; from = 4 - i; j <- from to 3) print(f"${10 * i + j}%3d")
// is the same as
for (i <- 1 to 3){
  var from = 4 - i
  for(j <- from to 3){
    println(f"${10 * i + j}%d")
  }
}

for (i <- 1 to 3; from = 4 - i; j <- from to 3) print(f"${10 * i + j}%3d")

for (i <- 1 to 10) yield i % 3

