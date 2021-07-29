package com.leilei.demo11_trait

/**
 * @author lei
 * @date 2021/7/12 21:44
 * @version 1.0
 * @desc 单利类继承特质
 */
object Demo04 {
  trait Animal{
    def eat(food:String)
  }

  object Cat extends Animal {
    override def eat(food: String): Unit = println(s"cat 喜欢吃:'$food'")
  }

  def main(args: Array[String]): Unit = {
    println(Cat.eat("fish"))
  }
}
