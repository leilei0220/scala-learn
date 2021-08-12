package com.leilei.demo25_source

import java.io.FileOutputStream

import scala.io.Source

/**
 * @author lei
 * @date 2021/8/11 22:00
 * @version 1.0
 * @desc 从文件读取数据，并输出到另一个文件
 */
object SourceDemo06 {
  def main(args: Array[String]): Unit = {
    // 从文件获取
    val source = Source.fromFile("src\\com\\leilei\\demo25_source\\student.txt")
    val strings:Iterator[String] = source.getLines()
    // 输出到文件
    val outputStream = new FileOutputStream("src\\com\\leilei\\demo25_source\\student_bak.txt")
    while (strings.hasNext) {
      outputStream.write(strings.next().getBytes())
    }
    outputStream.flush()
    //输出的文件再次获取属性打印
    val inSource = Source.fromFile("src\\com\\leilei\\demo25_source\\student_bak.txt")
    val inStrList:List[String] = inSource.getLines().toList
    println(inStrList)
  }
}
