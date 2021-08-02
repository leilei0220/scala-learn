package com.leilei.demo20_collection_operator

import scala.collection.mutable.ListBuffer

/**
 * @author lei
 * @date 2021/8/1 21:50
 * @version 1.0
 * @desc 循环遍历操作
 */
object ForeachDemo {
  def main(args: Array[String]): Unit = {
    var list = ListBuffer("a", "b", "c")
    var it = list.iterator
    while (it.hasNext) {
      println(it.next())
    }
    println("-" * 20)
    for (i <- 0 to list.size - 1) {
      println(list(i))
    }
    println("-" * 20)
    for (i <- 0 until list.size) {
      println(list(i))
    }
    println("-" * 20)
    for (i <- list) {
      println(i)
    }
    println("-" * 20)
    // 普通姿势
    list.foreach((x: String) => println(x))
    println("-" * 20)
    // 类型推断
    list.foreach(x => println(x))
    println("-" * 20)
    // 下划线
    list.foreach(println(_))
  }
}
