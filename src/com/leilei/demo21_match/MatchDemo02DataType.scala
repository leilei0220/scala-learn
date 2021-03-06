package com.leilei.demo21_match

import com.leilei.demo13_caseClass.Demo.User

/**
 * @author lei
 * @date 2021/8/4 22:27
 * @version 1.0
 * @desc 根据数据类型匹配
 */
object MatchDemo02DataType {
  def main(args: Array[String]): Unit = {
    var variable:Any = new User

    variable match {
      case x:Int=> println(s"元素$x 为Int")
      case x:String=> println(s"元素$x 为String")
      case x:User=> println(s"元素$x 为User")
    }

    // 简写模式 如果变量在表达式中未使用,可用下划线替代变量名

   var result:Int= variable match {
      case _:Int=> println(s"元素 为Int");  1
      case _:String=> println(s"元素 为String"); 2
      case _:User=> println(s"元素 为User"); -1
    }
    // 打印结果 -1
    println(result)
  }

   class User{
  }


}
