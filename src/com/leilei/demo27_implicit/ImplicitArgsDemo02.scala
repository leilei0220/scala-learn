package com.leilei.demo27_implicit

/**
 * @author lei
 * @date 2021/8/16 21:39
 * @version 1.0
 * @desc 隐式转换 参数 自动导入
 */
object ImplicitArgsDemo02 {
  def buildLevel(name: String)(implicit level: (String, String)) = level._1 + level._2 + name

  def main(args: Array[String]): Unit = {
    implicit val def_level: (String, String) = ("1#", "2#")
    println(buildLevel("23"))
    println(buildLevel("23")("a#", "b#"))
  }
}
