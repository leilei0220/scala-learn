package com.leilei.demo09_extends

/**
 * @author lei
 * @date 2021/7/5 21:24
 * @version 1.0
 * @desc
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val car = new Car
    // 子类属性 覆盖父类属性
    car.name = "节能"
    car.model = "东方红"
    //使用了自己的name Model属性 car:节能+东方红....running
    car.run()

    println("-" * 16)

    val car2 = new Car
    //使用了父类的name Model属性 车辆+麻麻牌....running
    car2.run()
  }
}
