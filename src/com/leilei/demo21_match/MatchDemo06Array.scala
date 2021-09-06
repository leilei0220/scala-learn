package com.leilei.demo21_match

/**
 * @author lei
 * @date 2021/8/8 20:33
 * @version 1.0
 * @desc 数组匹配
 */
object MatchDemo06Array {
  def main(args: Array[String]): Unit = {
    var array: Array[Int] = (1 to 10).toArray
    // 获取第一二个元素
    var Array(a, b, _*) = array
    println(a)
    println(b)
    println("-" * 20)


    val arr: Array[Int] = Array(1,4,6,8)
    arr match {
        // 匹配第一个下标为1 第三个下标为6的元素
      case Array(1,x,6,z) =>println(s"case: $x,$z")
      case Array(_,x,y) => println(s"case: $x,$y")
      case _ => println("nothing")

    }
  }
}
