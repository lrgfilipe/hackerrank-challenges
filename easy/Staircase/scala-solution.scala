def staircase(n: Int) =
  println((1 to n).map{ x => " "*(n-x) + "#"*x }.mkString("\n"))