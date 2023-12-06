import akka.actor._

var capital = Map("US" -> "Washington", "France" -> "Paris")

capital += ("Japan" -> "Tokyo")

println(capital("France"))

// Factorial

def factorial(x: BigInt): BigInt =
  if (x == 0) 1 else x * factorial(x - 1)

factorial(30)

// Checksum calculator service

class CheckSumActor extends Actor {
  var sum = 0
  def receive = {
    case Data(byte) => sum += byte
    case GetChecksum(requester) =>
      val checksum = ~(sum & 0xFF) + 1
      requester ! checksum
  }
}

// Scala Test library

val xs = 1 to 3
val it = xs.iterator
eventually { it.next() shouldBe 3 }

// class constructor in Scala

class MyClass(index: Int, name: String)

// String has upper case character
var name: String = "asaad"

val nameHasUpperCase = name.exists(_.isUpper)

println(nameHasUpperCase)

// Hashmap

val x = new HashMap[Int, String]()
val x: Map[Int, String] = new HashMap()


