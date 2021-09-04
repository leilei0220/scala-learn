package com.leilei.demo12_package

import java.util._

/**
 * @author lei
 * @date 2021/7/26 21:59
 * @version 1.0
 * @desc
 */
object DemoPackage {

  class User{
    private var userName:String=""
    // 本类 以及[]包下所有均可访问
    private[com] var age:Int=_

    def hello():Unit={
      println("hello")
    }

    private[com] def sayHello():Unit={
      println("say,hello")
    }

  }


  def main(args:Array[String]):Unit={
    var user=new User
    user.age=19
    println(s"${user.age}")
    println("---"*20)
    user.sayHello()

    import java.util._
    var list=new ArrayList[String]()

    import java.util.{ArrayList,HashMap}
    var map=new HashMap

  }
}
