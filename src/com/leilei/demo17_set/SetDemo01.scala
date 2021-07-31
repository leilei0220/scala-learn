package com.leilei.demo17_set

/**
 * @author lei
 * @date 2021/7/31 18:54
 * @version 1.0
 * @desc 不可变set
 */
object SetDemo01 {
  def main(args: Array[String]): Unit = {
    var emptySet= Set[String]()
    var set = Set(1, 1, 2, 3, 4, 5, 6, 7)

    println(set)
    // 获取set集长度
    println(set.size)
    // 转,分割的字符串
    println(set.mkString(","))
    // 集合内求和
    println(set.sum)
    // 取头 注意set本身是无序的
    println(set.head)
    // 取尾 注意set本身是无序的
    println(set.last)
    // 判断是否包含
    println(set.contains(2))
    // 循环
    for (ele <- set) println(ele)
    println("-" * 15)
    set.foreach(e => println(e))

  }
}
