package com.leilei.demo04_single

/**
 * @author lei
 * @date 2021/6/29 22:44
 * @version 1.0
 * @desc 单利对象（对象在内存中只有一个，且类中所有变量与方法都类似于java static修饰
 */
object SingleDemo {

  def main(args: Array[String]): Unit = {
    println(KeyUtil.collect)
    println(KeyUtil.keyName)
    println(KeyUtil.buildKey())
  }

  object KeyUtil {
    var keyName = "zs"
    var collect: Int = 0

    def buildKey(): String = "key"
  }

}
