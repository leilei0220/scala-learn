package com.leilei.demo06_associated

/**
 * @author lei
 * @date 2021/7/1 22:00
 * @version 1.0
 * @desc
 */
class AssociatedDemo {
  private val orgName: String = "钟薛高"

  def helloOrg():Unit= {
    println(orgName)
  }
  object AssociatedDemo{

   private val model: String = "特斯拉";

    def helloScala():Unit={
      println("static method")
      helloOrg()
      println(model)
    }
  }
}
