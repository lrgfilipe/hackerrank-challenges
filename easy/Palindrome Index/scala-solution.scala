import java.io._

object Solution {

  def isPalindrome(str:String): Boolean = {
    val len = str.length
    for(i <- 0 until len/2) if(str(i) != str(len-i-1)) return false
    true
  }

  def palindromeIndex(s: String): Int = {
    val len = s.size
    for (i <- 0 until len) {
      if (s(i) != s(len-i-1)){
        if (isPalindrome(s.patch(i, Nil, 1))) return i
        else if (isPalindrome(s.patch(len-i-1, Nil, 1))) return len-i-1
        return -1
      }
    }
    -1
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val q = stdin.readLine.trim.toInt
    for (qItr <- 1 to q) {
      val s = stdin.readLine
      val result = palindromeIndex(s)
      printWriter.println(result)
    }
    printWriter.close()
  }
}
