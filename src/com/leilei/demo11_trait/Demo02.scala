package com.leilei.demo11_trait

/**
 * @author lei
 * @date 2021/7/12 21:37
 * @version 1.0
 * @desc 继承多个特质 with
 */
object Demo02 {
  // 特质1
  trait Vehicle{
    // 含有抽象方法 子类必须复写
    def run()
  }
  // 特质2
  trait Product{
    // 含有抽象方法 子类必须复写
    def buy(price:Double)
  }

  // 定义普通类，同时实现 Vehicle Product两个特质，其中的抽象方法，必须都要被复写
  class Car extends Vehicle with  Product {
    override def run(): Unit = print("car--run")

    override def buy(price: Double): Unit = println(s"car的价格是：${price}")
  }

  def main(args: Array[String]): Unit = {
    val car =new Car
    car.run()
    car buy 11.23
  }
}
