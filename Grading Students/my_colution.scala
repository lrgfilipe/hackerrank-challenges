import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

  def nextDivisor(n: Int): Int = if (n % 5 == 0) n else nextDivisor(n+1)

  def gradingStudents(grades: Array[Int]): Array[Int] =
    grades.map{x => {
      if(x < 38) x
      else {
        val next = nextDivisor(x)
        if (next <= 100 && next - x < 3) next
        else x
      }
    }
  }

}

object Solution {
  def main(args: Array[String]) {

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val gradesCount = StdIn.readLine.trim.toInt
    val grades = Array.ofDim[Int](gradesCount)

    for (i <- 0 until gradesCount) {
      val gradesItem = StdIn.readLine.trim.toInt
      grades(i) = gradesItem
    }

    val result = Result.gradingStudents(grades)
    printWriter.println(result.mkString("\n"))
    printWriter.close()
  }
}