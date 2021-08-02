package com.leilei.demo19_iterator

/**
 * @author lei
 * @date 2021/8/1 21:14
 * @version 1.0
 * @desc
 */
object ListIteratorDemo {
  def main(args: Array[String]): Unit = {
    var list = List[Double](10)
    var listBuffer = List("a", "b", "c")
    for (elem <- listBuffer) {
      println(elem)
    }
    println("---------")
    listBuffer.foreach(e =>println(e))
    println("-" * 15)
    var list2=listBuffer.map(x =>x.toUpperCase)
    println(list2)
    println("---------")
    for (i <- 0 until listBuffer.length) {
      println(listBuffer(i))
    }
    println("---------")
    var it=listBuffer.iterator
    while (it.hasNext) {
      println(it.next())
    }
  }
}
