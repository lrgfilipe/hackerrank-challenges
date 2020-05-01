import java.io._

object Solution {

  // SLOW
  def birthdayCakeCandlesSLOW(ar: Array[Int]): Int = ar.count(_ == ar.max)

  // FAST
  def birthdayCakeCandles(ar: Array[Int]): Int = {
    var max = 0
    var count = 0
    for(x <- ar) {
      if (x > max) {max = x; count = 1}
      else if (x == max) count = count + 1
    }
    count
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val arCount = stdin.readLine.trim.toInt
    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = birthdayCakeCandles(ar)
    printWriter.println(result)
    printWriter.close()
  }
}
