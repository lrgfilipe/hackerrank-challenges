import java.io._
import scala.io._

object Solution {

  def balancedSums(arr: Array[Int]): String = {
    val half_total = arr.sum / 2
    var sum = 0
    var i = 0
    while(sum < half_total) {
      sum += arr(i)
      if (sum == half_total) return "NO"
      i = i + 1
    }
    val separated = arr.splitAt(i-1)
    return if (separated._1.sum == separated._2.drop(1).sum) "YES" else "NO"
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val T = StdIn.readLine.trim.toInt
    for (TItr <- 1 to T) {
      val n = StdIn.readLine.trim.toInt
      val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
      val result = balancedSums(arr)
      printWriter.println(result)
    }
    printWriter.close()
  }
}
