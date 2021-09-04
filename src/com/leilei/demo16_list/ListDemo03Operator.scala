package com.leilei.demo16_list

import scala.collection.mutable.ListBuffer

/**
 * @author lei
 * @date 2021/7/28 22:08
 * @version 1.0
 * @desc list 常用操作
 */
object ListDemo03Operator {
  def main(args: Array[String]): Unit = {
   var listBuffer= new ListBuffer[Int]()
    println(listBuffer)
    // 添加一个元素 1
    listBuffer+=1
    println(listBuffer)
    // 获取列表首元素
    println(listBuffer.headOption)

    // 更改列表索引0位置的元素为1111
    listBuffer(0)=1111
    println(listBuffer)

    // 添加多个元素
    listBuffer++=Array(1,2,3,4,5,6,7,8,9)
    println(listBuffer)

    // 删除元素 1
    listBuffer-=1
    println(listBuffer)

    // 删除多个元素
    listBuffer--=Array(2,3,5)
    println(listBuffer)

    // 列表排序
    listBuffer.sorted
    println(listBuffer)

    // 获取列表尾元素
    println(listBuffer.last)
    println(listBuffer.lastOption)

    // 可变列表转不可变列表
    println(listBuffer.toList)

    // 可变列表转不可变数组
    println(listBuffer.toArray)
  }
}
