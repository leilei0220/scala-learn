package com.leilei.demo20_collection_operator

/**
 * @author lei
 * @date 2021/8/2 21:41
 * @version 1.0
 * @desc
 */
object ReduceDemo {
  def main(args: Array[String]): Unit = {
    var list=(1 to 10).toList
    println(list)

    var set=Set(("马邦德","男",12),("张麻子","男",14),("花姐","女",15))
    //reduce
    println(set.map(_._3).reduce((a, b) => a + b))
    println(list.reduce((a,b)=>a+b))
    // fold 给定一个初始值
    println(list.fold(1)((a, b) => a + b))


  }
}
