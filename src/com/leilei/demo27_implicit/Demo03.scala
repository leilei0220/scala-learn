package com.leilei.demo27_implicit

/**
 * @author lei
 * @date 2021/8/16 21:47
 * @version 1.0
 * @desc
 */
object Demo03 {
  class RichList(list: List[Int]){
    def avg(): Double = {
      if (list.isEmpty) {
        0.0
      }else{
       list.sum /list.size
      }
    }
  }

  def main(args: Array[String]): Unit = {
    implicit def list2RichList(list: List[Int])=new RichList(list);

    val list=List(1,2,3,4,5,6,7,8,9)
    println(list.avg())
    val list2=List()
    println(list2.avg())
  }
}
