package com.leilei.demo09_extends

/**
 * @author lei
 * @date 2021/7/5 21:35
 * @version 1.0
 * @desc 
 */
object InstanceOfDemo {
  def main(args: Array[String]): Unit = {
    var car:Vehicle = new Car

    if (car.isInstanceOf[Vehicle]) {
      println("car 属于vehicle")
    }

    if (car.isInstanceOf[Any]) {
      println("car 属于Any")
    }

    if (car.isInstanceOf[Car]) {
      println("car 属于Car")
      var myCar = car.asInstanceOf[Car]
      myCar.run()
    }


    println("-" * 15)

    var vehicle = new Vehicle

    if (vehicle.isInstanceOf[Any]) {
      println("vehicle 属于 Any")
    }

    if (!vehicle.isInstanceOf[Car]) {
      println("vehicle 不属于 Car")
    }
    println("-" * 15)

    runVehicle(car)
  }

  def runVehicle(vehicle:Vehicle):Unit= {
    if (vehicle.isInstanceOf[Car]) {
      var car = vehicle.asInstanceOf[Car]
      car.run()
    }
  }
}
