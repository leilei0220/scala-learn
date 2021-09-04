package com.leilei.demo20_collection_operator
/**
 * @author lei
 * @date 2021/8/2 21:55
 * @version 1.0
 * @desc 综合练习操作
 */
object Demo {
  def main(args: Array[String]): Unit = {
    // 定义列表 记录学生成绩 格式为姓名 语文 数学 英语成绩

    var list= List(("张三",37,90,100),("李四",90,73,81),("王五",60,90,76),("赵六",59,21,72),
      ("田七",100,100,100))
    println(list)

    // 获取所有语文成绩在60分以上的同学信息
    val stu1: List[(String, Int, Int, Int)] = list.filter(_._2 > 60)
    println(stu1)

    // 获取所有学生的总成绩
    val totalScoreColl: List[(String, Int)] = list.map(x => x._1 -> (x._2 + x._3 + x._4))
    println(totalScoreColl)

    // 按照总成绩降序排列
    var orderColl: List[(String, Int)] =totalScoreColl.sortWith((x, y)=>x._2>y._2)
    println(orderColl)
  }
}
