package com.leilei.demo28_generic

/**
 * @author lei
 * @date 2021/8/18 22:15
 * @version 1.0
 * @desc 非变 协变 逆变
 */
object GenericDemo05 {

  class Person

  class Man extends Person

  class Demo1[T]()

  class Demo2[+T]()

  class Demo3[-T]()

  def main(args: Array[String]): Unit = {
    // 非变 Person与 Man 为父子关系，但  new Demo1[Person] 与  Demo1[Man] 无关系
    val d1 = new Demo1[Person]()
    //    val d2:Demo1[Man] = d1

    // 协变   Person与 Man 为父子关系，  new Demo2[Person] 与  Demo2[Man] 也为父子关系
    var d3: Demo2[Man] = new Demo2[Man]
    var d4: Demo2[Person] = d3

    // 逆变   Person与 Man 为父子关系，  new Demo2[Person] 与  Demo2[Man]  关系颠倒 子与父的关系
    var d5: Demo3[Person] = new Demo3[Person]
    var d6: Demo3[Man] = d5


  }

}
