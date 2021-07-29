package com.leilei.demo02_field

/**
 * @author lei
 * @date 2021/6/28 22:36
 * @version 1.0
 * @desc
 */
object TestUser02 {
  def main(args:Array[String]):Unit={
    var user=new User
    user.setName("zs")
    user.setAge(12)
    println(user)
  }


  class User{
    private var name:String=_

    private var age:Int=_

    def getName:String=name

    def setName(name:String):Unit=this.name=name

    def setAge(age:Int):Unit=this.age=age

    def getAge:Int=age
  }
}
