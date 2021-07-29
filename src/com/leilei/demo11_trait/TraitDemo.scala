package com.leilei.demo11_trait

/**
 * @author lei
 * @date 2021/7/19 21:38
 * @version 1.0
 * @desc 特质特性演示 可以有普通字段 抽象字段 普通方法 抽象方法
 */
object TraitDemo {

  trait Vehicle{
    var name:String="车辆"

    var model:String

    def run(): Unit ={
      println("汽车运行中")
    }

    def vehicleType():Unit
  }

  class Car extends Vehicle {
    override var model: String = "桑塔拉"

    override def vehicleType(): Unit = println("一汽大众")
  }

  def main(args: Array[String]): Unit = {
    var car=new Car
    car.run()
    car.vehicleType()
  }
}
