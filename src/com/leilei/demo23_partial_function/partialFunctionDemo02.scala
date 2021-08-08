package com.leilei.demo23_partial_function

/**
 * @author lei
 * @date 2021/8/8 21:55
 * @version 1.0
 * @desc 偏函数 结合结合函数使用
 */
object partialFunctionDemo02 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = (1 until 10).toList

    list.foreach {
      case x if x % 2 == 0 => println(x + ":为奇数")
      case x if x % 2 != 0 => println(x + ":为偶数数")
    }


    var list2 = list.map({
      case x if x < 3 => "[1-3)" -> x
      case x if x > 3 && x < 6 => "[3-6)" -> x
      case x => "[6-*)" -> x
    })
    println(list2)
  }

}
