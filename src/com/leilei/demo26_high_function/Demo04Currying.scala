package com.leilei.demo26_high_function

/**
 * @author lei
 * @date 2021/8/15 22:12
 * @version 1.0
 * @desc 柯里化
 */
object Demo04Currying {
  def main(args: Array[String]): Unit = {
    def add(num1: Int, num2: Int) = num1 + num2

    def reduce(num1: Int, num2: Int) = num1 - num2

    def take(num1: Int, num2: Int) = num1 * num2

    def divide(num1: Int, num2: Int) = num1 / num2

    println(add(2, 4))
    println(reduce(2, 4))
    println(take(2, 4))
    println(divide(2, 4))
    println("-" * 20)

    def calcCurrying(num1:Int,num2:Int)(f1:(Int,Int)=>Int)= f1(num1, num2)


    println(calcCurrying(2, 4)(_ + _))
    println(calcCurrying(2, 4)(_ - _))
    println(calcCurrying(2, 4)(_ * _))
    println(calcCurrying(2, 4)(_ / _))
  }
}
