package com.leilei.demo13_caseClass

/**
 * @author lei
 * @date 2021/7/26 22:24
 * @version 1.0
 * @desc
 */
object Demo {

  case class User(var name:String="张麻子",var age:Int=12){

  }


  def main(args: Array[String]): Unit = {
    var user = User("马邦德", 14)
    var user2 = User()
    var user3=user.copy(age = 18)
    var user4=user.copy()

    println(s"打印输出 user：$user")
    println(s"打印输出：${user.name},${user.age}")
    println(s"打印输出2：${user2.name},${user2.age}")
    println(s"打印输出3：${user3.name},${user3.age}")
    println(s"打印输出4：${user4.name},${user4.age}")
    println(user4.equals(user))

  }
}
