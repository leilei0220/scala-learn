package com.leilei.demo28_generic

/**
 * @author lei
 * @date 2021/8/18 21:20
 * @version 1.0
 * @desc 泛型类演示
 */
object GenericDemo02 {
  case class Result[T](count:Int,data:T)
  case class User(name:String,age:Int)

  def main(args: Array[String]): Unit = {
    val result = new Result[String](12, "aaa")
    println(result)

    val result2 = new Result[User](12, new User("无敌寂寞",16))
    println(result2)
  }
}
