package com.leilei.demo19_iterator

/**
 * @author lei
 * @date 2021/8/24 21:49
 * @version 1.0
 * @desc
 */
object IterableDemo01 {
  def main(args:Array[String]): Unit ={
    val ints: List[Int] = List(1, 2, 3, 4, 5, 6)

    ints.foreach(println(_))

    println("_"*15)

    val iterator: Iterator[Int] = ints.iterator
    while (iterator.hasNext) {
      println(iterator.next())
    }
  }
}
