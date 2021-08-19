package com.leilei.demo29_traversable

/**
 * @author lei
 * @date 2021/8/19 22:07
 * @version 1.0
 * @desc 集合结合偏函数（大括号包裹起来的多组case ）
 */
object TravelSableDemo04 {
  def main(args: Array[String]): Unit = {
    var traversable = Traversable(1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10)

    var evenFunction: PartialFunction[Int, Int] = {
      case x if x % 2 == 0 => x
    }

    val traversable1 = traversable.collect(evenFunction)
    println(traversable1)
    // 直接将偏函数写入collect中
    val traversable2 = traversable.collect({
      case x if x % 2 == 0 => x
    })
    println(traversable2)
  }
}
