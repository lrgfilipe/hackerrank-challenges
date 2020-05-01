import java.io._

object Solution {

  def miniMaxSum(arr: Array[Int]): Unit = {
    val xss = arr.combinations(4).map(_.map(_.toLong).sum).toList
    val ret = xss.foldLeft((xss(0), xss(0))){
      case ((min, max), e) => (math.min(min, e), math.max(max, e))
    }
    println(s"${ret._1} ${ret._2}")
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    miniMaxSum(arr)
  }
}
