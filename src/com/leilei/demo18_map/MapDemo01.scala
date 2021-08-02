package com.leilei.demo18_map

/**
 * @author lei
 * @date 2021/8/1 17:30
 * @version 1.0
 * @desc 不可变map(定义后，元素与长度均不可改变）
 *     （同java) key一致，后边的值会将前边的值覆盖
 */
object MapDemo01 {
  def main(args: Array[String]): Unit = {
    // 定义方式
    var map = Map(("张麻子", 15), ("马邦德", 22), ("马邦德", 23))
    var map2 = Map("张麻子" -> 15, "马邦德" -> 22, "马邦德" -> 23)
    println(s"map:$map")
    println(s"map2:$map2")
  }
}
