package com.leilei.demo20_collection_operator

import scala.collection.mutable.ListBuffer

/**
 * @author lei
 * @date 2021/8/2 20:40
 * @version 1.0
 * @desc 过滤与排序demo
 */
object FilterAndSortDemo {
  def main(args: Array[String]): Unit = {
    var user1: User = User("a", 1)
    var user2: User = User("zs",3)
    var user3: User = User("lss",2)
    var user4: User = User("qwer",19)
    var list: ListBuffer[User] =ListBuffer(user1,user2,user3,user4)

    println(s"list:$list")
   var filterList: ListBuffer[User] = list.filter(_.age < 18)
    println(s"filterList:$filterList")
    // 默认排序
    var numList= List(1, 3, 4, 5, 6)
   var sortedList: List[Int] = numList.sorted
    println(s"listSorted:$sortedList")
    // 指定按年龄字段倒叙排序
    var sortedList2: ListBuffer[User] = list.sortBy(_.age).reverse
    println(s"sortedList2:$sortedList2")

    // 自定义排序规则 （a,b）=> 逻辑  如果为true 则为倒叙，false则为升序
    // 按名字长度降序
    var sortWith1: ListBuffer[User] =list.sortWith((u1, u2)=>u1.name.length>u2.name.length)
    // 按名字长度升序
    var sortWith2: ListBuffer[User] =list.sortWith((u1, u2)=>u1.name.length<u2.name.length)
    println(s"sortWith 升序:$sortWith1")
    println(s"sortWith 降序:$sortWith2")
  }

  case class User(name:String,age:Int)
}
