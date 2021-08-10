package com.leilei.demo25_source

import scala.io.Source

/**
 * @author lei
 * @date 2021/8/10 22:19
 * @version 1.0
 * @desc 从字符串读取
 */
object SourceDemo02 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromString("1\n" +
      "2\n" +
      "3456789")
    val strings: Iterator[String] = source.getLines()
    while (strings.hasNext) {
      println(strings.next())
    }
  }
}
