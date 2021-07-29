package com.leilei.demo02_field

/**
 * @author lei
 * @date 2021/6/28 22:12
 * @version 1.0
 * @desc
 */
object TestUser {
  def main(args: Array[String]): Unit = {
    var user = new User
    user.age = 18
    user.name = "张三"
    println(user.name)
    println(user.age)
    println(user.printMessage("说话啊"))
    println(user printMessage "asdasd")
  }

  class User {
    var name: String = _
    var age: Int = _
    var sex: Boolean = _


    def printMessage(message: String): String = this.name + ":" + message
  }

}
