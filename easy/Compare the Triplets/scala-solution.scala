import java.io._
import scala.io._


object Solution {

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    val aux = (0 until a.size).map{x => compareElem(a(x), b(x))}.unzip
    Array(aux._1.sum, aux._2.sum)
  }

  def compareElem(a: Int, b: Int): (Int, Int) = if (a>b) (1,0) else if (b>a) (0,1) else (0,0)

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val result = compareTriplets(a, b)
    printWriter.println(result.mkString(" "))
    printWriter.close()
  }
}
