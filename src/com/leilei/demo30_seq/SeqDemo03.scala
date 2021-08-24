package com.leilei.demo30_seq

/**
 * @author lei
 * @date 2021/8/24 22:46
 * @version 1.0
 * @desc 判断元素是否存在
 */
object SeqDemo03 {
  def main(args: Array[String]): Unit = {
    val ints = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9999)


    println(s"判断集合是否存在1元素：${ints.contains(1)}")

    println(s"判断集合是否以 1 2 3 开始：${ints.startsWith(List(1,2,3))}")

    println(s"判断集合是否以 8, 9999 结尾：${ints.startsWith(List(8, 9999))}")

    println(s"判断集合是否包含子集合 （3，4，5，6） ：${ints.containsSlice(List(3,4,5,6))}")
  }
}
