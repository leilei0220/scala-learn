package com.leilei.demo01_oop

/**
 * @author lei
 * @date 2021/6/26 18:03
 * @version 1.0
 * @desc
 */
object Class02 {
  def main(args: Array[String]): Unit = {
    println(1,2,3,4,5,6)
    // 无参构造方法 可省略小括号
    var user=new User
    println(user printHello "aaaaa")
    println(user.printHello("aasasasda"))
    println(user)
  }

  /**
   *当类中无私有字段以及有参构造方法时，可省略大括号
   */
  class User{
    def printHello(message:String):String={
      message
    }
  }
}
