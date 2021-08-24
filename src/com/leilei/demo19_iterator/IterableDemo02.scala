package com.leilei.demo19_iterator

/**
 * @author lei
 * @date 2021/8/24 21:54
 * @version 1.0
 * @desc grouped 迭代器分组
 */
object IterableDemo02 {
  def main(args: Array[String]): Unit = {
    val iterator: Iterator[Int] = (1 to 20).iterator
    // 表示4个元素分一组
    val ints: iterator.GroupedIterator[Int] = iterator.grouped(4)
    while (ints.hasNext) {
      val intList: List[Int] = ints.next()
      println("====")
      intList.foreach(ele => println(ele + " "))
      println()
    }
  }
}
