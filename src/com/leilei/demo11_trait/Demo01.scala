package com.leilei.demo11_trait

/**
 * @author lei
 * @date 2021/7/12 21:35
 * @version 1.0
 * @desc 继承特质 （类似于接口）
 */
object Demo01 {
  trait Vehicle{
    def run()
  }

  class Bus extends Vehicle{
    override def run(): Unit = print("bus--run")
  }

  def main(args: Array[String]): Unit = {
    var bus=new Bus
    bus run()
  }
}
