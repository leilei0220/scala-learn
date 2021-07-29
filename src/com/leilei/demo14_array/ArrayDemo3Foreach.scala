package com.leilei.demo14_array

/**
 * @author lei
 * @date 2021/7/27 22:30
 * @version 1.0
 * @desc
 */
object ArrayDemo3Foreach {
  def main(args: Array[String]): Unit = {
    var arr= Array("java", "scala", "php", "go", "c++")
    // 根据下下标 遍历数组
    for (i<- 0 to arr.length-1)println(arr(i))
    println("-"*20)

    for (i <- 0 until arr.length) println(arr(i))
    println("-"*20)
    for (i <- arr.indices) println(arr(i))
    println("-"*20)

    for (i<- arr)println(i)

  }
}
