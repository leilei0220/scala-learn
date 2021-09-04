package com.leilei.demo19_iterator

import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks._

/**
 * @author lei
 * @date 2021/8/1 20:44
 * @version 1.0
 * @desc 注意迭代器本身有状态 同一个迭代器变量共享迭代位置
 */
object ArrayIteratorDemo {
  def main(args: Array[String]): Unit = {
    var array: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8)
    var arrayIterator: Iterator[Int] = array.iterator
    while (arrayIterator.hasNext) {
      println(arrayIterator.next())
    }
    println("-" * 15)
    var mutableArray: ArrayBuffer[String] = ArrayBuffer[String]()
    mutableArray.insert(0, "a")
    mutableArray.insert(1, "b")
    mutableArray.insert(2, "c")
    var mutableArrayIterator: Iterator[String] = mutableArray.iterator
    // a,c
    while (mutableArrayIterator.hasNext) {
      val ele: String = mutableArrayIterator.next()
      // 循环跳出 类似于Java continue操作
      breakable {
        if ("b".equals(ele)) {
          break()
        }
        println(ele)
      }
    }
    println("-" * 15)
    // 模拟Break操作 结束循环语句
    var result: String=null
    // 迭代器迭代位置共享,所以这里从新获取一个
    var mutableArrayIterator2: Iterator[String] =mutableArray.iterator
    breakable {
      while (mutableArrayIterator2.hasNext) {
        val ele: String = mutableArrayIterator2.next()
        // 判断元素中有 b 元素，则直接结束循环,打印最终result的值
        result = ele
        if ("b".equals(ele)) {
          break()
        }
      }
    }
    println(result)
    println("-" * 15)
    for (elem <- array) {
      print(elem)
    }
    println()
    println("-" * 15)
    for(i <- 0 to array.length-1) {
      print(array(i))
    }
    println("-" * 15)
    // 下划线简化函数定义， 需要每一个函数参数仅出现一次，且无复杂逻辑操作
    array.foreach(println(_))
    array.foreach(e=> println(e))
  }
}
