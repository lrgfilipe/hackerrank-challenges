import java.io._

object Solution {

  def camelcase(s: String): Int = s.count(_.isUpper) + 1

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val s = stdin.readLine
    val result = camelcase(s)
    printWriter.println(result)
    printWriter.close()
  }
}
