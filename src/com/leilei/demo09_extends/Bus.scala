package com.leilei.demo09_extends

/**
 * @author lei
 * @date 2021/7/5 21:22
 * @version 1.0
 * @desc
 */
class Bus extends Vehicle {
  override def setName(name:String): Unit = {
    this.name = name
  }

  override def setModel(model:String): Unit = {
    this.model = model
  }

  override def getName: String = name

  override def getModel: String = model

  override def run(): Unit = {
    println(s"bus:${name}+${model}....running")
  }
}
