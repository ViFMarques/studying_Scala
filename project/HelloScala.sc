// VALUES are constants
val hello: String = "Olá Vitória"

// VARIABLES are mutable
var helloThere: String = hello

helloThere = hello + " Marques"
println(helloThere)

// Data Types
val numberTwo: Int = 2
val truth: Boolean = true
val letterA: String = "a"
val pi: Double = 3.14159265
val piAgain: Float = 3.14159265f
val bigNumber: Long = 222223468979L // "L" in the final is for long
val smallNumber: Byte = 124

println("I mixed all:"+ numberTwo + truth + letterA + pi + piAgain +bigNumber + smallNumber)
println(f"Pi is about $piAgain%.3f")
print(f"Zero on the left: $numberTwo%05d")

// Booleans
val isGreater = 1 > 8
val isLesser = 1 < 2
val impossible = isGreater & isLesser
val anotherWay = isGreater || isLesser


// Flow control -----------

// Matching
val number = 9
number match {
  case 1 => println("one")
  case 2 => println("two")
  case 3 => println("three")
  case _ => println("something else")
}

//While loop
var x = 20
while (x >= 0) {
  println(x)
  x -= 1
}

// Functions
def squareIt(x: Int): Int = {
  x * x
}

// Creating a SparkSession
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder()
  .appName("example")
  .master("local[*]")
  .getOrCreate()
