def findMedian(xs: Array[Int]): Int = {
  assert(xs.size % 2 != 0)
  val x = xs.sorted
  x(xs.size/2)
}