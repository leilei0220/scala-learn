package com.leilei.demo21_match

/**
 * @author lei
 * @date 2021/8/4 22:59
 * @version 1.0
 * @desc 匹配之 样例类匹配
 */
object MatchDemo04CaseClass {
  case class User(name:String,age:Int)
  case class Model(brand:String,model:String)
  def main(args: Array[String]): Unit = {

//    var user:Any=User("zz",12)
    var user:Any=Model("zz","model")

    user match {
      case User(_, _)=>println("user对象")
      case Model(_, _)=>println("Model对象")
    }
  }
}
