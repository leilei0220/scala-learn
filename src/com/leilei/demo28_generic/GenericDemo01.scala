package com.leilei.demo28_generic

/**
 * @author lei
 * @date 2021/8/16 22:20
 * @version 1.0
 * @desc 泛型
 */
object GenericDemo01 {
  def main(args: Array[String]): Unit = {
    var list=List[Int](1,2,3,4,5,6)
    println(list)

    println(getResult(List(1, 2, 4, 6, 3)))
    println(getResult2(List("a","b")))
  }



  def getResult[Int](list: List[Int]):List[Int]={
    list
  }

  def getResult2[T](list: List[T]):List[T]=list
}
