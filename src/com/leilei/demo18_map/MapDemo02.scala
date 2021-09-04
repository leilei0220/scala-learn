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
    // 方式 1
    var map: MultableMap[String, Int] = MultableMap(("张麻子", 15), ("马邦德", 22), ("马邦德", 23))
    // 方式 2
    var map2: MultableMap[String, Int] = MultableMap("张麻子" -> 15, "马邦德" -> 22, "马邦德" -> 23)
    // 定义空Map
    var map3: MultableMap[String, Int] = MultableMap[String,Int]()
    println(s"map:$map")
    println(s"map2:$map2")
    // 添加新键值对
    map.put("啥哟",11)
    // 测试相同KEY
    map.put("马邦德",27)
    println(s"map:$map")
  }
}
