package com.leilei.demo29_traversable

/**
 * @author lei
 * @date 2021/8/19 22:19
 * @version 1.0
 * @desc 集合 scan的用法
 */
object TravelSableDemo05 {
  def main(args: Array[String]): Unit = {
    var traversable = Traversable(1, 2, 3, 4, 5, 6, 7, 8)

    // 求每个元素的阶乘  1： 1*1 2：1*1*2  3：1*2*3

    // 2的阶乘则为 1的阶乘结果*2  3的阶乘则为2的阶乘结果*3
    // scan 可获取处理结果 且可将处理结果作为参数 传入到下一次处理中
    //x 为上一次的结果  y 每下一个元素
    val ints = traversable.scan(1)((x: Int, y: Int) => x * y)
    // 简化
    val ints2 = traversable.scan(1)(_ * _)
    println(ints)
    println(ints2)
  }
}
