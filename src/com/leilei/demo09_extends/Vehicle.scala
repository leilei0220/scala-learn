package com.leilei.demo09_extends

/**
 * @author lei
 * @date 2021/7/5 21:17
 * @version 1.0
 * @desc
 */
class Vehicle {

  var name: String = _

  var model: String = _

  def setName(name:String): Unit = {
    this.name = name
  }

  def setModel(model:String): Unit = {
    this.model = model
  }

  def getName: String = name

  def getModel: String = model

  def run(): Unit = {
    print("vehicle.....running!")
  }
}
