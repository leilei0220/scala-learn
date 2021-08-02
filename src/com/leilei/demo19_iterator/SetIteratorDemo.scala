package com.leilei.demo19_iterator
import scala.collection.mutable.{Set =>MutableSet}
/**
 * @author lei
 * @date 2021/8/1 21:21
 * @version 1.0
 * @desc
 */
object SetIteratorDemo {
  def main(args: Array[String]): Unit = {
    var set= Set[Int]()
    var mutableSet= MutableSet[String]()
    mutableSet +="a"
    mutableSet ++= MutableSet("b", "c")
   var it= mutableSet.iterator
    while (it.hasNext) {
      println(it.next())
    }
    println("-" * 20)
    mutableSet.foreach(x => println(x))
    println("-" * 15)
    mutableSet.foreach(println(_))
    println("-" * 20)
    for(x <- mutableSet) {
      println(x)
    }

  }
}
