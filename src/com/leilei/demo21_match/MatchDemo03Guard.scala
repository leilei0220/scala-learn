package com.leilei.demo21_match

/**
 * @author lei
 * @date 2021/8/4 22:44
 * @version 1.0
 * @desc 匹配模式之守卫（表达式判断匹配）
 */
object MatchDemo03Guard {
  def main(args: Array[String]): Unit = {
    var score=10

    score match {
      case x if x<60 => println("不及格")

      case x if x>=60 && x <80 => println("一般")

      case x if x >80 => println("优秀")
    }
  }
}
