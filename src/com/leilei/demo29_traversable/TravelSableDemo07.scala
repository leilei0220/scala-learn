package com.leilei.demo29_traversable

import java.util

/**
 * @author lei
 * @date 2021/8/21 12:16
 * @version 1.0
 * @desc 判断集合总的元素 类似stream 中 allMatch anyMatch
 */
object TravelSableDemo07 {
  def main(args: Array[String]): Unit = {
    var traversable: Traversable[Int] = Traversable(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val list = util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
    //  forall 判断集合中元素是否全部满足条件 等价于java Stream中 allMatch
    println(traversable.forall(_ < 10))
    println(list.stream().allMatch(_ < 10))

    // exists 集合中任一元素满足条件 等价于java Stream中 anyMatch
    println(traversable.exists(_ > 10))
    println(list.stream().anyMatch(_ > 10))

  }
}
