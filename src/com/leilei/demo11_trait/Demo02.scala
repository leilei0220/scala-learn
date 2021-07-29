package com.leilei.demo11_trait

/**
 * @author lei
 * @date 2021/7/12 21:37
 * @version 1.0
 * @desc 继承多个特质 with
 */
object Demo02 {

  trait Vehicle{
    def run()
  }
  trait Product{
    def buy(price:Double)
  }

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
