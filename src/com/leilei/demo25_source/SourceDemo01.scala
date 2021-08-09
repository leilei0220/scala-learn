package com.leilei.demo25_source

import java.io.FileNotFoundException

import scala.io.{BufferedSource, Source}

/**
 * @author lei
 * @date 2021/8/9 22:35
 * @version 1.0
 * @desc 文件资源读取 按行读取
 */
object SourceDemo01 {
  def main(args: Array[String]): Unit = {
    var source:BufferedSource=null
    try{
      source = Source.fromFile("src\\com\\leilei\\demo25_source\\aa1.txt", "utf-8")
      var lines= source.getLines().toList
      println(lines)
      println(lines.flatMap(x => x.split("\\|")))
    }catch {
      case ex:FileNotFoundException=>
        println("文件不存在!")
      case ex:Exception=>
        println("异常!")
    }finally {
      if (source != null) {source.close()}

    }
  }
}
