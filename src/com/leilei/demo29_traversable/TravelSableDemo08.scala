package com.leilei.demo29_traversable

/**
 * @author lei
 * @date 2021/8/21 12:43
 * @version 1.0
 * @desc 快速填充集合中的元素
 *      Traversable.fill(填充数量)(元素生成规则)
 *
 *      Traversable.fill(填充数量,生成的每个元素数量（默认为1 大于1则生成元素为集合）)(元素生成规则)
 *
 *      Traversable.iterate(初始值,获取元素个数)(元素生成函数)
 *
 *      Traversable.range(初始值 最大值(实际为最大值-1) 每次间隔大小不写则为1)
 */
object TravelSableDemo08 {
  def main(args: Array[String]): Unit = {
    //List(vehicle, vehicle, vehicle)
    println(Traversable.fill(3)("vehicle"))

    // List(List(vehicle, vehicle), List(vehicle, vehicle), List(vehicle, vehicle))
    println(Traversable.fill(3,2)("vehicle"))
    // 1 1 1 1 1
    println(Traversable.iterate(1, 5)(_))
    // List(1, 4, 7, 10, 13, 16, 19)
    println(Traversable.range(1, 20, 3))
  }
}
