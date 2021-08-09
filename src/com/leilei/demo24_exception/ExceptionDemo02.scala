package com.leilei.demo24_exception

/**
 * @author lei
 * @date 2021/8/9 20:40
 * @version 1.0
 * @desc
 */
object ExceptionDemo02 {
  def main(args: Array[String]): Unit = {
    println(calc(1))
    println(calc(-1))
    println(calc(2))
  }

  def calc(num:Int):Int={
    if (num<0) {
      throw new Exception("数字%d不能小于0")
    }
    num
  }
}
