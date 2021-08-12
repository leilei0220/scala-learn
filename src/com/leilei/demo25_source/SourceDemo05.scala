package com.leilei.demo25_source

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

import scala.io.Source

/**
 * @author lei
 * @date 2021/8/11 21:46
 * @version 1.0
 * @desc 输出到文件中
 */
object SourceDemo05 {

  def main(args: Array[String]): Unit = {
    // 序列化
    var student = new Student("zs", 2)
    val stream = new ObjectOutputStream(new FileOutputStream("src\\com\\leilei\\demo25_source\\student2.txt"))
    stream.writeObject(student)
    stream.flush()
    stream.close()
    println("反序列化")
    val inPut = new ObjectInputStream(new FileInputStream("src\\com\\leilei\\demo25_source\\student2.txt"))
    val value = inPut.readObject()
    if (value.isInstanceOf[Student]) {
      val student1 = value.asInstanceOf[Student]
      println(student1)
    }
  }

  case class Student(name:String ,age:Int) extends Serializable {

  }
}
