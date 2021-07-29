package com.leilei.demo16_list

import scala.collection.mutable.ListBuffer

/**
 * @author lei
 * @date 2021/7/28 22:04
 * @version 1.0
 * @desc
 */
object ListDemo02 {
  def main(args: Array[String]): Unit = {
    var list = ListBuffer[String]()
    var list2 = ListBuffer[Int](1, 2, 3, 4, 5)
    println(list2)
    list2 += 3
    println(list2)
  }
}
