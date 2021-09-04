package com.leilei.demo16_list

/**
 * @author lei
 * @date 2021/7/31 18:23
 * @version 1.0
 * @desc
 */
object ListDemo05 {
  def main(args: Array[String]): Unit = {
    var nameList = List("jack", "cai", "mina")

    var ageList = List(11, 22, 33)
    //zip  压缩（两个list 组合为一个）
    var nameAgeList: List[(String, Int)] = nameList.zip(ageList)

    println(nameAgeList)
    // upZip  解压为了一个tuple2元组
    var unzipResult: (List[String], List[Int]) = nameAgeList.unzip
    println(unzipResult)
    println(s"unzip--nameList:${unzipResult._1}")
    println(s"unzip--ageList:${unzipResult._2}")

    //-------------------
    // list 转字符串
    println("-" * 20)
    println(nameList.toString())
    println(nameList.mkString(","))
    println(nameList.mkString("-"))
    println(nameList.mkString(" "))

    //---- 去重  并集 交集 差集
    println("-" * 20)
    var list1 = List(1, 2, 3, 4, 5, 6)
    var list2 = List(3, 4, 6, 11, 23)
    // 取并集
    var unionList: List[Int] = list1.union(list2)
    println(s"unionList:$unionList")
    // 去重
    var distinctList: List[Int] =unionList.distinct
    println(s"distinctList:$distinctList")

    // 取交集 list1 list2 都有的
    var intersectList: List[Int] = list1.intersect(list2)
    println(s"intersectList:$intersectList")

    // 取差集 list1中元素是list2中没有的
    var diffList: List[Int] = list1.diff(list2)
    println(s"diffList:$diffList")
  }
}
