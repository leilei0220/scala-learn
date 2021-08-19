package com.leilei.demo29_traversable

/**
 * @author lei
 * @date 2021/8/19 22:26
 * @version 1.0
 * @desc 集合操作 获取元素
 */
object TravelSableDemo06 {
  def main(args: Array[String]): Unit = {
    var traversable:Traversable[Int]=Traversable(1,2,3,4,5,6,7,8,9,10)
    // 获取集合首元素 T
    val head:Int = traversable.head
    println(head)
    // 获取集合尾元素 T
    val last:Int = traversable.last
    println(last)
  }
}
