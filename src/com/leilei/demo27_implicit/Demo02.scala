package com.leilei.demo27_implicit

import java.io.File

import scala.io.Source

/**
 * @author lei
 * @date 2021/8/16 21:28
 * @version 1.0
 * @desc 隐式转换 自动导入
 *      1.当对象调用类中不存在的方法或者成员时，编译器会自动对该对象进行隐式转换
 *      2.当方法中的参数类型与目标类型不一致时,编译器也会自动调用隐式转换.
 *
 */
object Demo02 {
  class MyFile(file:File){
    def readStr()=Source.fromFile(file).mkString;
  }

  def main(args: Array[String]): Unit = {
    implicit  def file2Myfile(file: File)=new MyFile(file)

    val file = new File("src\\com\\leilei\\demo27_implicit\\aa.txt")
    println(file.readStr())
  }
}
