def aVeryBigSum(ar: Array[Long]): Long = ar.reduce( (a,b) => sum(a.toString, b.toString))

def sum(a: String, b: String, rest: Int = 0, list: List[String] = Nil): Long = {
  if (a.isEmpty()) return (rest.toString + list.mkString).toLong
  val f = (a takeRight 1).toInt + (b takeRight 1).toInt + rest
  if (f < 10) sum(a dropRight 1, b dropRight 1, 0, f.toString :: list)
  else sum(a dropRight 1, b dropRight 1, f/10, (f%10).toString :: list)
}