package com.leilei.demo25_source

import scala.io.Source

/**
 * @author lei
 * @date 2021/8/10 22:49
 * @version 1.0
 * @desc 从url 读取
 */
object SourceDemo03 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromURL("https://blog.csdn.net/leilei1366615")
    val strings: Iterator[String] = source.getLines()
    while (strings.hasNext) {
      println(strings.next())
    }
  }
}
