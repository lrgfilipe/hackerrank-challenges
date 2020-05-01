import java.io._
import scala.math.BigDecimal

object Solution {

  def plusMinus(arr: Array[Int]): Unit = {
    var count = Array(0,0,0)
    for(x <- arr) {
      if (x > 0) count(0) = count(0) + 1
      else if (x < 0) count(1) = count(1) + 1
      else count(2) = count(2) + 1
    }
    for(x <- count) println((BigDecimal(x)/arr.size).setScale(6, BigDecimal.RoundingMode.HALF_UP))
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val n = stdin.readLine.trim.toInt
    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    plusMinus(arr)
  }
}
