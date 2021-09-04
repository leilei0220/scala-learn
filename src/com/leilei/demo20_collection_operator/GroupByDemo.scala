package com.leilei.demo20_collection_operator

/**
 * @author lei
 * @date 2021/8/2 21:13
 * @version 1.0
 * @desc 分组示例
 */
object GroupByDemo {
  def main(args: Array[String]): Unit = {
    var set=Set("马邦德"->"男","张麻子"->"男","花姐"->"女")
    println(set)
    var groupResult: Map[String, Set[(String, String)]] =set.groupBy(_._2)
    println(groupResult)
    var groupResult2: Map[String, String] =groupResult.map(x => (x._1,"人数:"+x._2.size))
    println(groupResult2)
  }
}
