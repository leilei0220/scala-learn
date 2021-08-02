package com.leilei.demo19_iterator

import scala.collection.mutable.{HashMap => MultHashMap}

/**
 * @author lei
 * @date 2021/8/1 21:34
 * @version 1.0
 * @desc
 */
object MapDEmo {
  def main(args: Array[String]): Unit = {
    var map = MultHashMap[String, String]()
    map.put("aa", "AA")
    map.put("bb", "BB")
    map.put("cc", "CC")
    println(map)
    print("-" * 20)
    val it = map.iterator
    while (it.hasNext) {
      println(it.next())
    }
    for ((k, v) <- map) {
      println(s"k=:$k,v=:$v")
    }
  }
}
