package com.leilei.demo31_stack


import scala.collection.mutable

/**
 * @author lei
 * @date 2021/8/25 22:33
 * @version 1.0
 * @desc 栈 后进先出（弹夹）
 *      示例使用 可变栈  mutable包下
 */
object StackDemo01 {
  def main(args: Array[String]): Unit = {
    // 从右往左依次添加
    val ints: mutable.Stack[Int] = mutable.Stack(1, 2, 3, 4, 5, 6, 7)
    println(s"栈：$ints")

    // 获取栈顶元素 只是查找不会移除
    println(s"栈顶元素:${ints.top}")

    // 压栈 （元素入栈）
    println(s"入栈新元素 3333 后 打印栈信息:${ints.push(333)}")

    // 集合压栈
    println(s"集合（777，888）压栈后 打印栈信息:${ints.pushAll(List(777, 888))}")

    // 移除栈顶元素 并返回该元素
    println(s"移除栈顶元素：${ints.pop()}")

    // 清空栈
    println(s"清空栈:${ints.clear()}")


  }
}
