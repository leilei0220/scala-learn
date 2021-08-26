package com.leilei.demo32_queue

import scala.collection.mutable

/**
 * @author lei
 * @date 2021/8/26 22:29
 * @version 1.0
 * @desc 队列 先进先出
 */
object QueueDemo01 {
  def main(args: Array[String]): Unit = {
    val queue: mutable.Queue[Int] = mutable.Queue(1, 2, 3, 4, 5)
    // 入列 会将元素放在队列尾
    queue.enqueue(6)
    println(s"初始队列:$queue")

    // 出列 移除队列首元素
    println(s"移除队列首元素:${queue.dequeue()}")

    // 出列 根据条件从队首开始寻找 移除第一个元素
    println(s"根据条件从队首开始寻找 移除第一个元素:${queue.dequeueFirst(x => x % 2 == 0).orElse(Some(0))}")

    // 出列 根据条件从队首开始寻找 移除所有满足条件的元素
    println(s"根据条件从队首开始寻找 移除所有满足条件的元素${queue.dequeueAll(x => x < 10)}")
  }
}
