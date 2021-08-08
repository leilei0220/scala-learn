package com.leilei.demo21_match

/**
 * @author lei
 * @date 2021/8/8 20:33
 * @version 1.0
 * @desc 数组匹配
 */
object MatchDemo06Array {
  def main(args:Array[String]):Unit={
    var array=(1 to 10).toArray
    // 获取第一二个元素
    var Array(a,b,_*)=array
    println(a)
    println(b)
  }
}
