 // TODO - NOT DONE YET



 val A = Array(2,1,3)
 val B = Array(7,8,9)


 def aux (k: Int, A: Array[Int], B: Array[Int]) = {
   val x = for { i1 <- A.toList; i2 <- B.toList; if i1 + i2 >= 10 } yield (i1, i2)
   val grouped = x.groupBy(_._1).filter(_._2.size == 1).map(_._2.head)

   var newA = List[Int]()
   var newB = List[Int]()

   for(item <- grouped) {
     newA = item._1 :: newA
     newB = item._2 :: newB
   }

   println(newA)
   println(newB)


 }

 aux(10, A, B)







 /*
 def twoArrays(k: Int, A: Array[Int], B: Array[Int]): String = {



   return ""
 }

 twoArrays(10,a,b)



 */
