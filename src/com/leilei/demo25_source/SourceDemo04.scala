package com.leilei.demo25_source

import java.io.FileOutputStream

import scala.io.Source

/**
 * @author lei
 * @date 2021/8/10 22:55
 * @version 1.0
 * @desc 写入数据到文件
 */
object SourceDemo04 {
  def main(args: Array[String]): Unit = {
    val outputStream = new FileOutputStream("src\\com\\leilei\\demo25_source\\student.txt")
    outputStream.write("张三 37 90 100\n".getBytes)
    outputStream.write("李四 90 73 81\n王五 60 90 76\n赵六 89 21 72\n田七 100 100 100".getBytes)
    outputStream.flush()
    outputStream.close()
    val source = Source.fromFile("src\\com\\leilei\\demo25_source\\student.txt")
    val chars: Iterator[String] = source.getLines()
    while (chars.hasNext) {
      println(chars.next())
    }
  }
}
