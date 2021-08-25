package com.leilei.demo31_stack

import scala.collection.mutable

/**
 * @author lei
 * @date 2021/8/25 22:47
 * @version 1.0
 * @desc
 */
object StackDemo02 {
  def main(args: Array[String]): Unit = {
    // 从右往左依次添加
    val stack: mutable.ArrayStack[Int] = mutable.ArrayStack(1, 2, 3, 4, 5)

    println(s"栈：$stack")

    // 获取栈顶元素 只是查找不会移除
    println(s"栈顶元素:${stack.top}")

    // 压栈 （元素入栈）
    println(s"入栈新元素 3333 后 打印栈信息:${stack.push(333)}")

    // 复制栈顶元素
    stack.dup()
    println(s"复制栈顶元素:${stack}")

    // 移除栈顶元素 并返回该元素
    println(s"移除栈顶元素：${stack.pop()}")

    // 清空栈
    //    println(s"清空栈:${stack.clear()}")

    // 恢复栈中数据
    stack.preserving({
      // 执行里边方法后，栈会恢复到执行之前的样子
      stack.clear()
      println("清空栈")
      println(stack)
    })
    //执行preserving 后，栈数据又恢复了
    println(stack)
  }
}
