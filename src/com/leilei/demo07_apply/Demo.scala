package com.leilei.demo07_apply

/**
 * @author lei
 * @date 2021/7/4 22:36
 * @version 1.0
 * @desc
 */
object Demo {


  def main(args: Array[String]): Unit = {
    var px = new Person()
    println(px)
    var p = new Person(name = "张三")
    println(p)
    var p1 = new Person(age = 18, name = "张三")
    println(p1)
    var p2 = Person(age = 18, name = "张三")
    println(p2)
  }

  class Person(var name: String = "", var age: Int = 12) {
    override def toString: String = s"name=$name"+s"age=$age"
  }

  object Person {
    def apply(name: String, age: Int): Person = new Person(name, age)
  }

}
