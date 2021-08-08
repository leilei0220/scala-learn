package com.leilei.demo22_option

/**
 * @author lei
 * @date 2021/8/8 21:10
 * @version 1.0
 * @desc
 */
object OptionalDemo {
  def main(args: Array[String]): Unit = {
    println(divide(2, 1))
    println(divideOption(2, 0))
    println(divideOption(2, 0).getOrElse(Int.MaxValue))
  }

  def divide(num1: Int, num2: Int): Int = num1 / num2

  def divideOption(num1: Int, num2: Int): Option[Int] ={
    if (num2==0) {
     return None
    }
    Some(num1 / num2)
  }
}
