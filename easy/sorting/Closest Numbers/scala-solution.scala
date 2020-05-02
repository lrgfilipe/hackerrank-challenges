// 2 Options

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


def closestNumbers(xs: Array[Int], min: Int = Int.MaxValue, ret: Array[Int] = Array[Int]()): Array[Int] = {
  if (xs.size < 2) ret
  else {
    var xss = xs
    if (min == Int.MaxValue) xss = xs.sorted
    val xy = xss.take(2)
    var xyDif = (xy.head - xy.last).abs
    if (xyDif < min) closestNumbers(xss.drop(1), xyDif, Array(xy.head, xy.last))
    else if (xyDif == min) closestNumbers(xss.drop(1), min, ret :+ xy.head :+ xy.last)
    else closestNumbers(xss.drop(1), min, ret)
  }
}