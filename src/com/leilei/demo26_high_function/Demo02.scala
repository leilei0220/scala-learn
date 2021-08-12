package com.leilei.demo26_high_function

/**
 * @author lei
 * @date 2021/8/11 22:19
 * @version 1.0
 * @desc 匿名函数（ 没有将函数赋值给变量）
 */
object Demo02 {
  def main(args: Array[String]): Unit = {
    var function = (num: Int) => "*" * num
    var list = (1 to 10).toList
    println(list)
    println(list.map(function))
    // 匿名函数
    println(list.map(x => "*" * x))
    println(list.map("*" * _))
  }
}
