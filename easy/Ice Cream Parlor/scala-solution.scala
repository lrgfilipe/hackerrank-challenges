def secondIndexOf(xs: Array[Int], i: Int): Int = xs.indexOf(i, xs.indexOf(i)+1);

def icecreamParlor(m: Int, arr: Array[Int]): Array[Int] = {
  arr.combinations(2).find(_.sum == m) match {
    case Some(i) => {
      if(i.toSet.size == 2) i.map(arr.indexOf(_)+1).sorted
      else Array(arr.indexOf(i.head)+1, secondIndexOf(arr, i.head)+1)
    }
    case None => Array()
  }
}