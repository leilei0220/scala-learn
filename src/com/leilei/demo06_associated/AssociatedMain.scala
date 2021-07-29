package com.leilei.demo06_associated

/**
 * @author lei
 * @date 2021/7/1 22:04
 * @version 1.0
 * @desc
 */
object AssociatedMain {
  def main(args: Array[String]): Unit = {
    val demo = new  AssociatedDemo
    demo.simpleMethod()
    println("----------")
    AssociatedDemo.staticMethod()
  }


  class AssociatedDemo {
    private val orgName: String = "钟薛高"

    def simpleMethod():Unit= {
      println("simpleMethod+simple filed"+orgName)
    }
  }

  object AssociatedDemo{
    private val model: String = "特斯拉";
    def staticMethod():Unit= {
      println("static method + static filed " + model)
    }
  }
}
