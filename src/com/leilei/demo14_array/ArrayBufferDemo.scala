package com.leilei.demo14_array

import scala.collection.mutable.ArrayBuffer

/**
 * @author lei
 * @date 2021/7/27 22:18
 * @version 1.0
 * @desc 可变数组CRUD操作
 */
object ArrayBufferDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个可变数组 （String)类型，并添加 java,scala,python 三个元素

    var arr= ArrayBuffer("java", "scala", "python")
    println(s"原始元素：$arr")
    // 添加一个go元素
    arr+="go"
    println(s"添加一个go元素后：$arr")

    // 添加 h5 、c++两个元素
    arr++=Array("h5","c++")
    println(s"添加h5,c++两个元素后：$arr")

    // 移除元素go
    arr-="go"
    println(s"移除元素go后：$arr")

    // 移除 h5,c++
    arr--=Array("h5","c++")
    println(s"移除元素h5,c++后：$arr")
  }
}
