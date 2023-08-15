object Q3 {
  val toUpper = (str: String,indexArr: Array[Int])=> {
    val shift = 'a'.toInt - 'A'.toInt
    var upper = ""
    for (index <-0 until str.length) {
      val i = str.charAt(index)
      if(indexArr.contains(index)){
        if (i >= 'a' && i <= 'z') upper += (i - shift).toChar
        else upper += i
      }
      else upper += i
    }
    upper
  }
  val toLower = (str: String, indexArr: Array[Int]) => {
    val shift = 'a'.toInt - 'A'.toInt
    var lower = ""
    for (index <- 0 until str.length) {
      val i = str.charAt(index)
      if (indexArr.contains(index)) {
        if (i >= 'A' && i <= 'Z') lower += (i + shift).toChar
        else lower += i
      }
      else lower += i
    }
    lower
  }

  def formatNames(name: String, index: Array[Int], formatFunc: (String, Array[Int]) => String): String ={
    formatFunc(name,index)
  }

  def main(args: Array[String]): Unit = {

    val names: Array[String] = Array("Benny", "Niroshan", "Saman", "Kumara")

    val indexB: Array[Int] = Array(0,1, 2, 3, 4)
    println(formatNames(names(0),indexB,toUpper))

    val indexN: Array[Int] = Array(0, 1)
    val indexNS: Array[Int] = Array(2,3,4,5,6,7)
    val answer2 = formatNames(names(1), indexN, toUpper)
    println(formatNames(answer2, indexNS, toLower))

    val indexS: Array[Int] = Array(0, 1, 2, 3, 4)
    println(formatNames(names(2), indexS, toLower))

    val indexK: Array[Int] = Array(0, 5)
    val indexKS: Array[Int] = Array(1,2,3,4)
    val answer3 = formatNames(names(3), indexK, toUpper)
    println(formatNames(answer3, indexKS, toLower))

  }
}