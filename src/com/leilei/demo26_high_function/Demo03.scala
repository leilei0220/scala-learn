package com.leilei.demo26_high_function

/**
 * @author lei
 * @date 2021/8/11 22:35
 * @version 1.0
 * @desc 柯里化
 */
object Demo03 {
  def main(args: Array[String]): Unit = {
    println(joiner("lei", "pp"))
    println(joiner1("lei", "pp"))
    println(joiner2("lei", "pp"))
    println("=" * 15)
    // 第二个参数填写方法，只要保证 两个参数结果仍为String即可
    println(joinerCurrying("lei", "pp")(_ + _))
    println(joinerCurrying("lei", "pp")(_.toUpperCase() + _))
    println(joinerCurrying("lei", "pp")(_.toUpperCase() + _.toUpperCase()))
  }

  def joiner(string1: String, string2: String): String = string1 + string2

  def joiner1(string1: String, string2: String): String = string1.toUpperCase() + string2

  def joiner2(string1: String, string2: String): String = string1.toUpperCase() + string2.toUpperCase()

  // 柯里化操作  joiner2(a,b) => joinerCurrying(a) (b)
  // 只不过我这里 a 使用 ab 参数 b 使用自定义函数
  def joinerCurrying(string1: String, string2: String)(function: (String, String) => String): String = function(string1, string2)
}
