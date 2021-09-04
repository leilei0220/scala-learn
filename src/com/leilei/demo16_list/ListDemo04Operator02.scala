package com.leilei.demo16_list

import scala.collection.mutable.ListBuffer

/**
 * @author lei
 * @date 2021/7/29 21:30
 * @version 1.0
 * @desc
 */
object ListDemo04Operator02 {
  def main(args: Array[String]): Unit = {
    var list= ListBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    println(s"list：$list")

    println(s"判空：${list.isEmpty}")

    println(s"获取首部元素:${list.head}")

    println(s"获取尾部元素:${list.last}")

    println(s"元素反转:${list.reverse}")

    println(s"除首元素外其余全部元素:${list.tail}")

    println(s"获取指定个数首部元素:${list.take(1)}")

    println(s"排除指定长度元素（从首部开始）后的所有尾部元素:${list.drop(3)}")

    println("--" * 20)

    var lists=List(List(1,2),List(2,3), List(3, 5))
    println(s"lists:$lists")
    println(s"lists-flatten 元素扁平化:${lists.flatten}")
  }
}
