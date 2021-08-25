package com.leilei.demo30_seq

/**
 * @author lei
 * @date 2021/8/25 22:06
 * @version 1.0
 * @desc 修改指定元素
 */
object SeqDemo04 {
  def main(args: Array[String]): Unit = {
    val ints: Seq[Int] = Seq(1, 2, 3, 4, 5)
    println(ints)
    // 将索引1位置的值 替换为111
    val ints1: Seq[Int] = ints.updated(1, 111)
    println(ints1)

    // 从索引1 开始 用Seq（666, 8888, 9999） 替换三个元素
    val ints2: Seq[Int] = ints.patch(1, Seq(666, 8888, 9999),3)
    println(ints2)
  }
}
