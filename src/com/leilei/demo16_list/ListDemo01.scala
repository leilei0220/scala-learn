package com.leilei.demo16_list

import scala.util.control.Breaks

/**
 * @author lei
 * @date 2021/7/28 22:01
 * @version 1.0
 * @desc 定长列表
 */
object ListDemo01 {
  def main(args: Array[String]): Unit = {
    var list = List(1, 2, 3, 4, 5, 6, 7)
    var list2 = List("aa", "bb")
    println(list)
    println(list2)
    println("-"*15)
    for (a <- list2) println(a)
  }
}
