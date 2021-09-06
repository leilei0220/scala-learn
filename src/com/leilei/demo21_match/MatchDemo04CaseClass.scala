package com.leilei.demo21_match

import scala.collection.mutable.ArrayBuffer

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

    var user:Any=User("zz",12)
//    var user:Any=Model("zz","model")
//    var user:Any=ArrayBuffer(1,2,3,4,5)

    user match {
      // 样例类匹配 精准匹配，所有属性值与匹配指定的一致
      // 匹配name为zz,age 为 12 的 user对象
      case User("zz", 12)=>println("user对象 name=zz,age=12")

      // 样例类匹配 半模糊，只要是该类且指定位置的值一致
      // 匹配age 为 12 的 user对象
      case User(_, 12)=>println("user对象 且age 为12")

      // 样例类匹配 全模糊，只要是该类（且字段属性值类型一致）即可，不在乎类中属性值
      case User(_, _)=>println("user对象")

      case Model(_, _)=>println("Model对象")

      // 托底 类似java switch default 以上case都为匹配则会走到这
      case _=>println("未知对象,走默认方法！")
    }
  }
}
