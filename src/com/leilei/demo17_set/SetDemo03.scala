package com.leilei.demo17_set

import scala.collection.mutable.{Set => MutableSet}

/**
 * @author lei
 * @date 2021/7/31 19:29
 * @version 1.0
 * @desc 可变集合 名称与不可变集Set一致，但是可变集合在scala.collection.mutable.Set 包下，注意引用
 *       import scala.collection.mutable.{Set =>MutableSet} 自定义别名 与普通不可变Set进行区分
 */
object SetDemo03 {
  def main(args: Array[String]): Unit = {
    // 注意  MutableSet 是我自定义了可变Set的别名
    // class scala.collection.mutable.HashSet
    var scalableSet = MutableSet(1, 2, 3, 3)
    println(scalableSet.getClass)
    println(scalableSet)
    // 添加一个元素 4
    scalableSet += 4
    println(scalableSet)

    // 添加多个元素 可使用List 可使用Set 作为参数
    scalableSet ++= MutableSet(2, 4, 5, 6, 7)
    println(scalableSet)

    // 删除元素 1
    scalableSet -= 1
    println(scalableSet)

    // 删除元素 4，5
    scalableSet --= Set(4, 5)
    println(scalableSet)

    // 其余头 尾 循环等 均与不可变集一致
  }
}
