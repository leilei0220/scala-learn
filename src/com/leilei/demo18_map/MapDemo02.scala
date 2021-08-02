package com.leilei.demo18_map
import scala.collection.mutable.{Map => MultableMap}
/**
 * @author lei
 * @date 2021/8/1 17:36
 * @version 1.0
 * @desc 可变Map(键值 长度可变)  scala.collection.mutable.Map 包下
 */
object MapDemo02 {
  def main(args: Array[String]): Unit = {
    var map = MultableMap(("张麻子", 15), ("马邦德", 22), ("马邦德", 23))
    var map2 = MultableMap("张麻子" -> 15, "马邦德" -> 22, "马邦德" -> 23)
    println(s"map:$map")
    println(s"map2:$map2")
    map.put("啥哟",11)
    map.put("马邦德",27)
    println(s"map:$map")
  }
}
