package com.leilei.demo14_array

import scala.collection.mutable.ArrayBuffer

/**
 * @author lei
 * @date 2021/7/27 22:04
 * @version 1.0
 * @desc 变长数组
 */
object ArrayDemo2 {
  def main(args: Array[String]): Unit = {
    var variableArray: ArrayBuffer[String] = ArrayBuffer[String]()
    println("variableArray" + variableArray)

    var variableArray2= ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("variableArray2" + variableArray2)
  }
}
