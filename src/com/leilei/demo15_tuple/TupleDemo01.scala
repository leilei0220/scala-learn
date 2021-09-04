package com.leilei.demo15_tuple

/**
 * @author lei
 * @date 2021/7/28 21:26
 * @version 1.0
 * @desc
 */
object TupleDemo01 {
  def main(args: Array[String]): Unit = {
    val tuple0: Unit = ()
    val tuple1=("马邦德")
    val tuple2: (String, Int) =("马邦德",12)
    // 只有tuple2 大小的元组可以用此方式
    val tuple2Copy: (String, Int) ="马邦德"-> 12
    val tuple3: (String, Int, Int) =("张麻子",188,13)
    val tuple4: (String, Int, Int, Boolean) =("张麻子",188,13,true)
    val tuple5: (String, Int, Int, Boolean, Char) =("张麻子",188,13,true,'A')
    val tuple6: (String, Int, Int, Boolean, Char, Double) =("张麻子",188,13,true,'A',2.2)
    val tuple7: (String, Int, Int, Boolean, Char, Double, Int) =("张麻子",188,13,true,'A',2.2,0x123456)
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
