package com.leilei.demo30_seq

/**
 * @author lei
 * @date 2021/8/24 22:38
 * @version 1.0
 * @desc 获取指定元素的索引
 */
object SeqDemo02 {
  def main(args: Array[String]): Unit = {
    val ints: Seq[Int] = Seq(1, 2, 3, 45, 6, 7, 8, 12, 2, 22, 87)
    // 获取元素2 第一次出现的索引位置
    println(ints.indexOf(2))

    // 获取元素2 最后一次出现的索引位置
    println(ints.lastIndexOf(2))

    // 获取小于5 且为偶数的 第一个元素索引位置
    println(ints.indexWhere(x => x < 5 && x % 2 == 0))

    // 获取小于5 且为偶数的 最后一个元素索引位置
    println(ints.lastIndexWhere(x => x < 5 && x % 2 == 0))

    // 从索引2 开始寻找 获取第一个偶数的索引
    println(ints.indexWhere(x => x < 5 && x % 2 == 0, 2))
    println("-" * 15)
    // 获取集合 3，45 出现的索引  (返回匹配集合 的第一个元素的索引  这里是返回3的索引位置)
    println(ints.indexOfSlice(List(3, 45)))
  }
}
