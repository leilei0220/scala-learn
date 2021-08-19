package com.leilei.demo23_partial_function

import scala.collection.mutable.ListBuffer

/**
 * @author lei
 * @date 2021/8/8 21:43
 * @version 1.0
 * @desc 偏函数（大括号包裹起来的多组case语句）示例
 */
object PartialFunctionDemo01 {
  def main(args: Array[String]): Unit = {

    var pf2: PartialFunction[Int, String] = {
      case 1 => "一"
      case 2 => "二"
      case _ => "未知数"
    }


    var pf: PartialFunction[Int, ListBuffer[Int]] = {
      case x => {
        var list = ListBuffer[Int](); list += x
      }
    }

    println(pf(1))
    println(pf(2))
    println(pf(3))
    println(pf(4))
    println("-" * 20)
    println(pf2(4))
    println(pf2(1))
  }
}
