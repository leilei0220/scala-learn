package com.leilei.demo18_map

import scala.collection.mutable.{HashMap => MutableHashMap, Map => MutableMap}

/**
 * @author lei
 * @date 2021/8/1 17:40
 * @version 1.0
 * @desc map集合常用操作
 */
object MapDemo03Operator {
  def main(args: Array[String]): Unit = {
    var map: MutableMap[Int, String] = MutableMap(1 -> "zs", 2 -> "ls", 3 -> "ww`")
    //    var map = MutableMap((1, "zs"), (2, "ls"), (3, "ww"))
    // 指定为hashMap 定义 kv 泛型,且向其中添加元素
    var hashMap: MutableHashMap[String, Int] = MutableHashMap[String, Int]()
    // 添加元素
    hashMap.put("zs", 1)
    hashMap.put("ls", 2)
    hashMap.put("ww", 3)
    hashMap += "xxx" -> 4
    println(s"mutableMap:$map")
    println(s"mutableHashMap:$hashMap")
    println("-" * 20)
    println(("-" * 10) + "operator" + ("-" * 10))
    // 获取有多少对元素
    println(s"size:${hashMap.size}")
    // 判断元素是否包含
    println(s"contains:${hashMap.contains("zs")}")
    println("-" * 20)
    // 根据key 获取value
    println(s"get:${hashMap.get("zs")}")
    // 根据key 获取value,不存在则返回默认值
    println(s"getOrElse:${hashMap.getOrElse("bb", 123456)}")
    // 根据key 获取value,不存在则返回默认键值并将该键值 put到对应映射集
    println(s"getOrElseUpdate:${hashMap.getOrElseUpdate("bb", 123456)}")
    println(s"getOrElseUpdate:${hashMap}")
    println("-" * 20)
    // 获取所有key 集合
    println(s"keySet:${hashMap.keySet}")
    // 获取所有value
    println(s"values:${hashMap.values}")
    println("-" * 20)
    // Map 循环
    for ((k, v) <- hashMap) {
      println(s"k=:$k,v=:$v")
    }
    println("-" * 20)
    for ((k, v) <- hashMap if v > 1) {
      println(s"k=:$k,v=:$v")
    }
    // 移除key为1的键值对
    println(s"map remove1 3前：$map")
    map.remove(1)
    map -= 3
    println(s"map remove1 3后：$map")
    // 清空所有键值对
    map.clear()
    println(s"clear后：$map")
  }
}
