import java.io._
import scala.math.BigInt

object Solution {

  def extraLongFactorials(n: Int, k: BigInt = BigInt(1)): String = {
    if (n == 1) k.toString
    else extraLongFactorials(n-1, k * n)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val n = stdin.readLine.trim.toInt
    printWriter.println(extraLongFactorials(n))
    printWriter.close()
  }
}
