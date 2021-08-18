package com.leilei.demo28_generic

/**
 * @author lei
 * @date 2021/8/18 21:28
 * @version 1.0
 * @desc 泛型特质
 */
object GenericDemo03 {

  trait BinlogHandler[T]{

    def handler(data:T)
  }

  case class Driver(name:String,age:Int)

  class DriverLogHandler extends BinlogHandler[Driver] {
    override def handler(data: Driver): Unit = {
      println(data)
    }
  }

  case class Vehicle(plate:String,color:String)

  class VehicleLogHandler extends BinlogHandler[Vehicle] {
    override def handler(data: Vehicle): Unit = println(data)
  }

}
