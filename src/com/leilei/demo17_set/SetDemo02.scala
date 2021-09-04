package com.leilei.demo17_set

/**
 * @author lei
 * @date 2021/7/31 19:21
 * @version 1.0
 * @desc 不可变Set操作2
 */
object SetDemo02 {
  def main(args: Array[String]): Unit = {
    var set= Set(1, 1, 2, 3, 4)
    println(set)

    // 减去元素1 此时会生成一个新的不可变set2 Set(2, 3, 4) ,原本的set是没有变化的
    var set2: Set[Int] =set-1
    println(set2)

    // 减去多个元素，此时生成set3  Set(1, 4)
    var set3: Set[Int] = set -- Set(2, 3)
    println(set3)

    // 拼接一个其他set
    var set4: Set[Int] =set++Set(5,7,8,9,0)
    println(set4)

    // 拼接一个其他集合
    var set5: Set[Int] =set++List(99,87,68,59,40)
    println(set5)
  }

}
