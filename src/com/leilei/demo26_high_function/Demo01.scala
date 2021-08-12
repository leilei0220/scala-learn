package com.leilei.demo26_high_function

/**
 * @author lei
 * @date 2021/8/11 22:13
 * @version 1.0
 * @desc 高阶函数示例 1
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    var function = (num: Int) => "*" * num
    var list=List(1,2,3,4,5,6,7,8,9)
    println(list)
    println(list.map(function))

  }

}
