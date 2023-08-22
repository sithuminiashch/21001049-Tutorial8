object Q3 {
  val toUpper: (String) => String = x => x.toUpperCase()
  val toLower: (String) => String = x => x.toLowerCase()


  val toCharUpper: (String, Int) => String = (x, index) => {
    val newString = new StringBuilder(x)
    val char = newString(index)
    newString(index) = char.toUpper
    newString.toString()
  }

  val FormatName1: ((String) => String, String) => Unit = (f, x) => println(f(x))

  val FormatName2: ((String, Int) => String, String, Int) => Unit = (f, x, y) => println(f(x,y))

def main(args: Array[String]): Unit = {
  FormatName1(toUpper, "Benny")
  FormatName2(toCharUpper, "Niroshan", 1)
  FormatName1(toLower, "saman")
  FormatName2(toCharUpper, "Kumara", 5)
  }
}
  
