package com.leilei.demo15_tuple

/**
 * @author lei
 * @date 2021/7/28 21:26
 * @version 1.0
 * @desc
 */
object TupleDemo01 {
  def main(args: Array[String]): Unit = {
    var tuple0=()
    var tuple1=("马邦德")
    var tuple2=("马邦德",12)
    // 只有tuple2 大小的元组可以用此方式
    var tuple2Copy="马邦德"-> 12
    var tuple3=("张麻子",188,13)
    var tuple4=("张麻子",188,13,true)
    var tuple5=("张麻子",188,13,true,'A')
    var tuple6=("张麻子",188,13,true,'A',2.2)
    var tuple7=("张麻子",188,13,true,'A',2.2,0x123456)
    //------
    println(tuple0)
    println(tuple1)
    println(tuple2)
    println(tuple2Copy)
    println(tuple3)
    println(tuple4)
    println(tuple5)
    println(tuple6)
    println(tuple7)
  }
}
