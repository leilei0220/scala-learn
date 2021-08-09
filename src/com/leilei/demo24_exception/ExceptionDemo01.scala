package com.leilei.demo24_exception

/**
 * @author lei
 * @date 2021/8/9 20:37
 * @version 1.0
 * @desc
 */
object ExceptionDemo01 {
  def main(args: Array[String]): Unit = {
    try {
      var a =1/0
    }catch  {
      case exception: Exception=>{
        // / by zero
        println(exception.getMessage)
      }
    }finally {
      println("hello,scala")
    }

  }
}
