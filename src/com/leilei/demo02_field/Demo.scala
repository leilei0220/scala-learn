package com.leilei.demo02_field

/**
 * @author lei
 * @date 2021/6/26 18:17
 * @version 1.0
 * @desc
 */
object Demo {
  def main(a: Array[String]): Unit = {
    var student = new Student()
    student.age = 18
    student.name = "张三"
    student.price = 22.2
    student.sex = false
    print(student)
  }

  class Student {
    // 可直接声明字段类型 ;也可省略，让scala编译推断;也可采用_
    // var name: String = ""
    // var name= ""
    //采用_ 此种方式必须显示声明类型,且只有var类型可使用此方式  String 类型默认则为null Int类型默认则为0 Boolean默认为false...........
    var name: String = _

    var sex = true

    var age: Int = 0

    var price: Double = 0.0

    // val 修饰的字段不可改变
    val xx = ""

    override def toString: String = this.name + "==" + this.sex + "==" + this.age + "==" + this.price
  }

}
