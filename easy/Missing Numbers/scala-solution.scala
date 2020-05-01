import java.io._
import scala.util._

object Solution {

  def missingNumbers(arr: Array[Int], brr: Array[Int]): Array[Int] = {
    var ret = List[Int]()
    val as = arr.sorted
    val bs = brr.sorted
    for(i <- (0 until bs.size)){
      if (as.size <= i - ret.size || bs(i) != as(i - ret.size))
        ret = bs(i) :: ret
    }
    return collection.SortedSet(ret: _*).toArray
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val n = stdin.readLine.trim.toInt
    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    val m = stdin.readLine.trim.toInt
    val brr = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = missingNumbers(arr, brr)
    printWriter.println(result.mkString(" "))
    printWriter.close()
  }
}
