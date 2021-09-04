package com.leilei.demo09_extends

/**
 * @author lei
 * @date 2021/7/5 21:21
 * @version 1.0
 * @desc
 */
class Car extends Vehicle {

  override def run(): Unit = {
    println(s"car:$name+$model....running")
  }
}
