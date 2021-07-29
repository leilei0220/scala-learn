package com.leilei.demo09_extends

/**
 * @author lei
 * @date 2021/7/5 21:21
 * @version 1.0
 * @desc
 */
class Car extends Vehicle {

  override def setName(name:String): Unit = {
    this.name = name
  }

  override def setModel(model:String): Unit = {
    this.model = model
  }

  override def getName: String = name

  override def getModel: String = model

  override def run(): Unit = {
    println(s"car:$name is running")
  }
}
