package com.leilei.demo20_collection_operator

import scala.collection.mutable

/**
 * @author lei
 * @date 2021/8/1 21:54
 * @version 1.0
 * @desc 元素映射，一种元素转为另一种元素（也可相同）
 */
object MapDemo {
  def main(args: Array[String]): Unit = {
    var set = mutable.Set("a", "b", "c")
    println(set)
    println("-" * 20)
    // 类型推断
    println(set.map(x => x.toUpperCase))
    // 下划线
    println(set.map(_.toUpperCase))
  }
}
