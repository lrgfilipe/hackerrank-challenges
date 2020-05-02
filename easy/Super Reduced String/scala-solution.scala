import java.io._
import scala.io._

object Solution {

  def superReducedString(s: String): String = {
    var rest = Array[Char]()
    for(x <- s.toCharArray) {
      if (rest.size == 0) rest = rest :+ x
      else if (x != rest.last) rest = rest :+ x
      else rest = rest.dropRight(1)
    }
    if (rest.size > 0) rest.mkString else "Empty String" // this is stupid ...
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val s = StdIn.readLine
    val result = superReducedString(s)
    printWriter.println(result)
    printWriter.close()
  }
}
