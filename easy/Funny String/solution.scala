import java.io._

object Solution {

  def funnyString(s: String): String = {
    val x = s.map(_.toInt).sliding(2).map{x => (x(0) - x(1)).abs}
    val y = s.reverse.map(_.toInt).sliding(2).map{x => (x(0) - x(1)).abs}
    if (x sameElements y) "Funny" else "Not Funny"
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val q = stdin.readLine.trim.toInt
    for (qItr <- 1 to q) {
      val s = stdin.readLine
      val result = funnyString(s)
      printWriter.println(result)
    }
    printWriter.close()
  }
}
