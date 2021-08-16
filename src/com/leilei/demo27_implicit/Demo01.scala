package com.leilei.demo27_implicit

import java.io.File

import scala.io.Source

/**
 * @author lei
 * @date 2021/8/16 21:02
 * @version 1.0
 * @desc 隐式转换 手动导入
 */
object Demo01 {
  class MyFile(file:File){
    def read()=Source.fromFile(file).mkString;
  }
  object ImplicitDemo{
    implicit  def fileToMyFile(file: File)=new MyFile(file)
  }

  def main(args: Array[String]): Unit = {
    import ImplicitDemo.fileToMyFile
    val file = new File("src\\com\\leilei\\demo27_implicit\\aa.txt")
    println(file.read())
  }
}
