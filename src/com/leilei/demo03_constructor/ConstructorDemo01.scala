package com.leilei.demo03_constructor

/**
 * @author lei
 * @date 2021/6/29 22:04
 * @version 1.0
 * @desc
 */
object ConstructorDemo01 {
  def main(args: Array[String]): Unit = {
    val user1 = new User("zs", 11)
    println(user1)
    println(s"user1: name:${user1.name} age:${user1.age} sex:${user1.age}")

    val user2=new User(age=12,name="ls",sex = true)
    println("user2"+user2)

    val user3=new User(Array("adas",18,true))
    println("user3"+user3)
    println(s"user3:name:${user3.name} age:${user3.age} sex:${ if (user3.sex)"男" else "女"}")
  }

  /**
   * 主构造器
   * @param name
   * @param age
   * @param sex
   */
  class User(var name: String, var age: Int, var sex: Boolean = false) {
    /**
     * 复写toString
     * @return
     */
    override def toString: String = s"[age = $age, name = $name,sex=$sex]"

    /**
     * 辅助构造器 （以不同的参数列表向主构造靠拢）
     * @param array
     */
    def this(array: Array[Any]){
      // 辅助构造器第一行代码必须是调用主构造器
      this(array(0).toString,array(1).toString.toInt,array(2).toString.toBoolean)
    }
  }

}
