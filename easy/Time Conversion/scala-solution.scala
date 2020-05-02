import java.io.PrintWriter

object Solution {

  def timeConversion(s: String): String = {
    if (s.contains("PM") && s.take(2).toInt != 12)
      (s.take(2).toInt + 12).toString + s.drop(2).dropRight(2)
    else if (s.take(2).toInt == 12 && s.contains("AM"))
      "00" + s.drop(2).dropRight(2)
    else
      s.dropRight(2)
  }

  def main(args: Array[String]) {
    val scan = scala.io.StdIn
    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))
    val s = scan.readLine
    val result = timeConversion(s)
    fw.println(result)
    fw.close()
  }
}
