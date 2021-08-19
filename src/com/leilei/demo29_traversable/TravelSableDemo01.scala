package com.leilei.demo29_traversable

import scala.collection.mutable.ListBuffer

/**
 * @author lei
 * @date 2021/8/19 21:26
 * @version 1.0
 * @desc TravelSable 是所有集合的最顶级的父特质 其中的方法，所有子特质都实现了
 */
object TravelSableDemo01 {

  def main(args: Array[String]): Unit = {
    var tr1:Traversable[Int]= Traversable[Int]()
    var tr2:Traversable[Int]= Traversable.empty[Int]
    var tr3:Traversable[Int]= Nil

    println(tr1 eq tr2)

    var tr4:Traversable[Int]= List(1,2,3,4,5).toTraversable

    var tr5:Traversable[Int]= Set(1,2,3,4,5).toTraversable

    var tr6:Traversable[Int]= Set(1,2,3,4,5)

    var tr7:Traversable[Int]= ListBuffer(1,2,3,4,5)
  }
}
