object Main {

  val CalInterest: (Int) => Double = (x) => if (x <= 20000) x * 0.02
  else if (x <= 20000) x * 0.04
  else if (x <= 200000) x * 0.035 else x * 0.065




  def main(args: Array[String]): Unit = {
    println(CalInterest(50000))
  }
}
