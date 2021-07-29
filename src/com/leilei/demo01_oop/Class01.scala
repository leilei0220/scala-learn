package com.leilei.demo01_oop

/**
 * @author lei
 * @date 2021/6/26 18:02
 * @version 1.0
 * @desc
 */
object Class01 {
  def main(args: Array[String]): Unit = {
    println(1, 2, 3, 4, 5, 6)
    val user = new User()
    val user2 = new User()
    println(user)

    if (1==1){
      println("1")
    }
  }

  class User{
    override def toString: String = super.toString
  }
}
