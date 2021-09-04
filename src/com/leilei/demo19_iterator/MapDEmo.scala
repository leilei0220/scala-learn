package com.leilei.demo19_iterator

import scala.collection.mutable
import scala.collection.mutable.{LinkedHashMap => MultHashMap}
import scala.util.control.Breaks._

/**
 * @author lei
 * @date 2021/8/1 21:34
 * @version 1.0
 * @desc
 */
object MapDEmo {
  def main(args: Array[String]): Unit = {
    var map: mutable.Map[String, String] = MultHashMap[String, String]()
    map.put("aa", "AA")
    map.put("bb", "BB")
    map.put("cc", "CC")
    println(map)
    print("-" * 20)
    val it: Iterator[(String, String)] = map.iterator
    while (it.hasNext) {
      val tuple: (String, String) = it.next()
      println(tuple._1 +"_"+tuple._2)
    }
    print("-" * 20)
    for ((k, v) <- map) {
      println(s"k=:$k,v=:$v")
    }
    print("-" * 20)
    println(">" * 20)
    map.foreach(x=> {
      if (x._1.eq("aa")) {
        return
      }
      println(x._1,x._2)
    })
    print("-" * 20)
    // break
    breakable{
      for ((k, v) <- map) {
        if (k.eq("aa")) {
          break()
        }
        println(s"k=:$k,v=:$v")
      }
    }
    print("-" * 20)
    //continue
    for ((k, v) <- map) {
      breakable {
        if (k.eq("aa")) {
          break()
        }
        println(s"k=:$k,v=:$v")
      }
    }
  }
}
