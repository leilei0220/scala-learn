package com.leilei.demo21_match

/**
 * @author lei
 * @date 2021/8/8 20:43
 * @version 1.0
 * @desc for 循环匹配
 */
object MatchDemo07For {
  def main(args: Array[String]): Unit = {
    var list = List("小明" -> 1, "小丽" -> 2, "小也" -> 3, "小溪" -> 4)

    // 匹配._1 为小明的严肃
    for (e <- list if e._1.eq("小明")) {
      println(e)
    }
    println("-" * 20)

    var map= Map("小明" -> 1, "小丽" -> 1, "小也" -> 3, "小溪" -> 4)
    // 条件获取 v==1的键值对
    println("-" * 20)
    for ((k,v)<- map if v==1) {
      println(k,v)
    }

    println("-" * 20)
    // 指明匹配 获取 value 为1的键值对
    for ((k,1)<- map) {
      println(k,1)
    }
  }
}
