//package com.leilei.demo28_generic
//
//import scala.collection.mutable.ListBuffer
//
///**
// * @author lei
// * @date 2021/8/18 21:47
// * @version 1.0
// * @desc 泛型上界
// *      上界表示 泛型具体类型必须为指定类型以及其子类
// */
//object GenericDemo04 {
//  case class  Person()
//
//  case class Man() extends Person
//
//
//  def main(args:Array[String]):Unit ={
//    val list1= ListBuffer[Person](new Man)
//    check(list1)
//  }
//  // 表示只能传入类型为 Person及其子类的集合
//  def check[T<:Person](list:ListBuffer[T]): Unit ={
//    println(list)
//  }
//
//}
