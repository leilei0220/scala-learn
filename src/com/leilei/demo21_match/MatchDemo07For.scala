package com.leilei.demo21_match

import scala.collection.mutable

/**
 * @author lei
 * @date 2021/8/8 20:43
 * @version 1.0
 * @desc for 循环匹配
 */
object MatchDemo07For {
  def main(args: Array[String]): Unit = {
    var list = List("小明" -> 1, "小丽" -> 2, "小也" -> 3, "小溪" -> 4)

    for (e <- list if e._1.eq("小明")) {
      println(e)
    }
    var map= Map("小明" -> 1, "小丽" -> 1, "小也" -> 3, "小溪" -> 4)
    // 条件获取 v==1的键值对
    println("-" * 20+"if判断")
    for ((k,v)<- map if v==1) {
      println(k,v)
    }

    println("-" * 20  +"匹配")
    // 指明匹配 获取 v为1的键值对
    for ((k,1)<- map) {
      println(k,1)
    }
  }
}
