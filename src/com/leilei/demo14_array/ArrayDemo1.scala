package com.leilei.demo14_array

/**
 * @author lei
 * @date 2021/7/27 21:56
 * @version 1.0
 * @desc 定长数组
 */
object ArrayDemo1 {
  def main(args: Array[String]): Unit = {
    // Int 数组 元素默认为0，String 元素默认为null
    var arr=new Array[Int](10)
    println(s"arr:$arr")
    println("-" * 30)
    arr(1)=12
    arr(2)=2
    println(arr.length)
    println(s"arr:$arr")
    println(arr(0))
    println(arr(1))
    println(arr(2))
    println("===" * 13)

  }



}
