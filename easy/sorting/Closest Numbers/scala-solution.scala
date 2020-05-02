def closestNumbers(xs: Array[Int]): Array[Int] = {
  var minDif = Int.MaxValue
  var ret = Array[Int]()
  for(x <- xs.sorted.sliding(2)) {
    var dif = (x.head - x.last).abs
    if (dif < minDif) {
      minDif = dif
      ret = Array(x.head, x.last)
    }
    else if (dif == minDif) ret = ret :+ x.head :+ x.last
  }
  ret
}