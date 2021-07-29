package com.leilei.demo15_tuple

/**
 * @author lei
 * @date 2021/7/28 21:37
 * @version 1.0
 * @desc
 */
object TupleDemo02Foreach {
  def main(args: Array[String]): Unit = {
    var tuple2=("张三",18)
    var tuple3=("张三",18,199,22)
    // 通过下标访问对应元素 从1开始
    println(tuple2._1)
    println(tuple2._2)
    println("="*20)
    // 迭代器方式
    var xx=tuple3.productIterator
    for (i<- xx)println(i)
  }
}
