import java.io._

object Solution {

  def staircase(n: Int) =println((1 to n).map{ x => " "*(n-x) + "#"*x }.mkString("\n"))

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val n = stdin.readLine.trim.toInt
    staircase(n)
  }
}
