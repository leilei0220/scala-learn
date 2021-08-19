package com.leilei.demo29_traversable

/**
 * @author lei
 * @date 2021/8/19 21:59
 * @version 1.0
 * @desc 集合拼接  ++效率较低，且每次++都会构建一个新的集合
 */
object TravelSableDemo03 {
  def main(args: Array[String]): Unit = {
    var traversable1= Traversable(1, 2, 3)
    var traversable2= Traversable(4, 5, 5)
    var traversable3= Traversable(7,8,9)

    val traversable4= Traversable.concat(traversable1, traversable2, traversable3)
    println(traversable4)
  }
}
