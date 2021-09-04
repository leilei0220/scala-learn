package com.leilei.demo10_abstract

/**
 * @author lei
 * @date 2021/7/6 20:54
 * @version 1.0
 * @desc
 */
object AbstractTest {

  abstract class Vehicle {
    // 抽象字段 子类必须复写
    var name: String
    // 普通字段 子类无需复写
    var age: Int = 12
    // 抽象字段 子类必须复写
    var model: Int
    // 抽象方法 子类必须复写
    def run()

    // 普通方法 子类无需复写
    def normalMethod(): Unit = {
      println("普通方法，子类无需复写")
    }
  }

  class Car extends Vehicle {
    override var name: String = "小汽车"
    override var model: Int = 1

    override def run(): Unit = {
      println(this.name + this.model + "--发车了")
    }

    def monitor(str: String): String = {
      str.toUpperCase()
    }
  }

  class Bus extends Vehicle {
    override var name: String = "社区巴士"
    override var model: Int = 2

    override def run(): Unit = {
      println(this.name + this.model + "--嘟嘟嘟")
    }

  }

  class Loco extends Vehicle {
    override var name: String = "机车"
    override var model: Int = 3

    override def run(): Unit = {
      println(this.name + this.model + "--是真的机车")
    }

    def competition(): Unit = {
      println("今晚决赛圈见")
    }
  }

  def main(args: Array[String]): Unit = {
    var car: Vehicle = new Car
    car.run()
    println("==" * 15)
    val bus: Vehicle = new Bus
    bus.run()
    println("==" * 15)
    val loco: Vehicle = new Loco
    loco.run()
  }
}
