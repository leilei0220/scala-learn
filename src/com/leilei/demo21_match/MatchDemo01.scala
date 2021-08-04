package com.leilei.demo21_match

/**
 * @author lei
 * @date 2021/8/4 22:10
 * @version 1.0
 * @desc 匹配模式（可看作java中的 switch) 匹配
 */
object MatchDemo01 {
  def main(args: Array[String]): Unit = {
    var num: Int = 1
    // match case匹配到后,便会跳出返回结果
    println("执行方法")
    num match {
      case 1 => println(1)
      case 2 => println(2222)
      // _ 这里是通配的意思 可理解为 default
      case _ => println("未知数字")
    }

    num = 999
    num match {
      case 1 => println(1)
      case 2 => println(2222)
      // _ 这里是通配的意思 可理解为 default
      case _ => println("未知数字")
    }
    println("-" * 15)
    println("获取返回值")

    var str: String = "王小明"
    var result = str match {
      case "zs" => str.toUpperCase()
      case _ => str.toUpperCase() * 2
    }
    println(result)
  }
}
