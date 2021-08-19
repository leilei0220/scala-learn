package com.leilei.demo29_traversable

/**
 * @author lei
 * @date 2021/8/19 21:39
 * @version 1.0
 * @desc 转置操作  类似于 列变行
 *       135
 *       246
 *       357
 *       转置后为
 *       123
 *       456
 *       789
 */
object TravelSableDemo02 {
  def main(args: Array[String]): Unit = {
    var travel: Traversable[Traversable[Int]] = Traversable(Traversable(1, 3, 5), Traversable(2, 4, 6), Traversable(3, 5, 7))

    var travel2: Traversable[Traversable[Int]] = travel.transpose

    println(travel2)
    // List(List(1, 2, 3), List(3, 4, 5), List(5, 6, 7))

    var list1:List[List[Int]]=List(List(1, 3, 5),List(2, 4, 6),List(3, 5, 7))
    val list2:List[List[Int]] = list1.transpose
    println(list2)
  }
}
