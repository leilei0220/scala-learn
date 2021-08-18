package com.leilei.demo28_generic

import java.io.{BufferedWriter, File, FileOutputStream, FileWriter}
import java.nio.ByteBuffer

import scala.io.Source

/**
 * @author lei
 * @date 2021/8/18 22:36
 * @version 1.0
 * @desc
 */
object AggregationDemo {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("src\\com\\leilei\\demo28_generic\\1.txt")


    val strList = source.mkString.split("\\s+").toList
    var writeList = strList.filter(_!= null).distinct.map(_.toInt)
    writeList = writeList.sorted
    println(writeList)
    val writer = new BufferedWriter(new FileWriter("src\\com\\leilei\\demo28_generic\\2.txt"))
    writeList.foreach(e=>{
      writer.write(e.toString);writer.newLine()
    })
    writer.flush()
    writer.close()

  }
}
