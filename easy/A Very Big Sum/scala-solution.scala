import java.io._

object Solution {

  // start
  def aVeryBigSum(ar: Array[Long]): Long = ar.reduce( (a,b) => sum(a.toString, b.toString))

  def sum(a: String, b: String, rest: Int = 0, list: List[String] = Nil): Long = {
    if (a.isEmpty()) return (rest.toString + list.mkString).toLong
    val f = (a takeRight 1).toInt + (b takeRight 1).toInt + rest
    if (f < 10) sum(a dropRight 1, b dropRight 1, 0, f.toString :: list)
    else sum(a dropRight 1, b dropRight 1, f/10, (f%10).toString :: list)
  }
  // end

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val arCount = stdin.readLine.trim.toInt
    val ar = stdin.readLine.split(" ").map(_.trim.toLong)
    val result = aVeryBigSum(ar)
    printWriter.println(result)
    printWriter.close()
  }
}
