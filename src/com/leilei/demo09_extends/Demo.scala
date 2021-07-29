package com.leilei.demo09_extends

/**
 * @author lei
 * @date 2021/7/5 21:24
 * @version 1.0
 * @desc
 */
object Demo {
  def main(args: Array[String]): Unit = {
    var car=new Car
    car.setName("节能")
    car.setModel("东方红")
    car.run()
    println("-"*20)
    var bus =new Bus
    bus.setName("万科")
    bus.setModel("西方绿")
    bus.run()
  }
}
