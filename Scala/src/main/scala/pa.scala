object Pa {
  def main(args: Array[String]): Unit = {
    args.foreach(arg => println(arg)) // can also be written args.foreach(println) because the function literal consists of one statement that takes a single argument.
  }
}