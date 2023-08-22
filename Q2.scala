 object Q2 {

  val PatternMatching: Int => Unit = x => if (x <= 0) println("Negative/Zero")
  else if (x%2 == 0) println("Even")
  else if (x%2 == 1) println("Odd")


  def main(args: Array[String]): Unit = {
    PatternMatching(scala.io.StdIn.readInt())
  }
}
