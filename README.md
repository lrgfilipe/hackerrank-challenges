# Challenges from hackerrank.com

![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)
![GitHub last commit](https://img.shields.io/github/last-commit/lrgfilipe/hackerrank-challenges)
![GitHub forks](https://img.shields.io/github/forks/lrgfilipe/hackerrank-challenges?style=social)
![GitHub stars](https://img.shields.io/github/stars/lrgfilipe/hackerrank-challenges?style=social)

My solutions on some challenges from hackerrank.com



## Easy

**Algorithms / Warmup - All done in at least one language**
- A Very Big Sum - [Scala, Python3, Java 8, Javascript (Node.Js), Kotlin](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/A%20Very%20Big%20Sum)
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
- Palindrome Index - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Palindrome%20Index)

**Algorithms / Search**
- Missing Numbers - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Missing%20Numbers)
- Sherlock and Array - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Sherlock%20and%20Array)


**Algorithms / Greedy**
- Mark and Toys - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Mark%20and%20Toys)
- Permuting Two Arrays - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/easy/Permuting%20Two%20Arrays)



## Medium

**Algorithms / Implementation**
- Extra Long Factorials - [Scala](https://github.com/lrgfilipe/hackerrank-challenges/tree/master/medium/Extra%20Long%20Factorials)


## Some utilities

####  Measuring code execution time
```scala
// scala
def time[R](block: => R): R = {
  val t0 = System.nanoTime()
  val result = block
  val t1 = System.nanoTime()
  val diff = t1-t0
  println(s"Elapsed time: ${diff} ns ${diff / 1000000} ms ${diff / 1000000000} sec")
  result
}

var list = time {List.range(1,1000, 1)}
```
```python
# python
import time
start = time.time()
print("hello")
end = time.time()
print(end - start)
```

####  Generate random string with size N
```scala
import scala.util.Random
def generateRandomString (n: Int): String = {
  val x = Random.alphanumeric
  return x.take(n).mkString
}
```


