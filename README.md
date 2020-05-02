# Challenges from hackerrank.com

My solutions on some challenges from hackerrank.com



## Easy

**Algorithms / Warmup**
- A Very Big Sum - [Scala](https://github.com/lrgfilipe/hackerrankchallenges/blob/master/easy/A%20Very%20Big%20Sum)
- Compare the Triplets - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Compare%20the%20Triplets)
- Diagonal Difference - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Diagonal%20Difference)
- Simple Array Sum - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Simple%20Array%20Sum)
- Staircase - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Staircase)
- Plus Minus - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Plus%20Minus)
- Mini-Max Sum - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Mini-Max%20Sum)
- Birthday Cake Candles - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Birthday%20Cake%20Candles)
- Time Conversion - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Time%20Conversion)


**Algorithms / Strings**
- CamelCase -  [Scala](https://github.com/lrgfilipe/hackerrank-challenges/blob/master/easy/CamelCase)
- Funny String - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Funny%20String)
- Super Reduced String - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Super%20Reduced%20String)


**Algorithms / Search**
- Missing Numbers - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Missing%20Numbers)
- Sherlock and Array - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Sherlock%20and%20Array)


**Algorithms / Greedy**
- Mark and Toys - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Mark%20and%20Toys)
- Permuting Two Arrays - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Permuting%20Two%20Arrays)



## Medium

**Algorithms / Implementation**
- Extra Long Factorials - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/medium/Extra%20Long%20Factorials)



##  Measuring code execution time
```scala
def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block
    val t1 = System.nanoTime()
    println(s"Elapsed time: ${t1 - t0} ns ${(t1-t0) / 1000000} ms ${(t1-t0) / 1000000000} sec")
    result
}

var list = time {List.range(1,1000, 1)}
```

##  Generate random string with size N
```scala
import scala.util.Random
def generateRandomString (n: Int): String = {
  val x = Random.alphanumeric
  return x.take(n).mkString
}
```


