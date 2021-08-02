package com.leilei.demo20_collection_operator

/**
 * @author lei
 * @date 2021/8/2 20:29
 * @version 1.0
 * @desc
 */
object FlatMapDemo {
  def main(args: Array[String]): Unit = {
    var set=Set("1#2#3#4#5","4#5#6#7#8#9")
   var set2= set.flatMap(x=>x.split("#"))
    println(s"set:$set")
    println(s"set2:$set2")
    var set3= set.flatMap(_.split("#"))
    println(s"set3:$set3")
  }
}
