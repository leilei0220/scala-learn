package com.leilei.demo21_match

/**
 * @author lei
 * @date 2021/8/8 18:12
 * @version 1.0
 * @desc 元组匹配
 */
object MatchDemo05Tuple {
  def main(args: Array[String]): Unit = {
    var tuple2: (String, Int) ="张三" -> 2

    var tuple3: (Int, Int, Int) =(1,2,3)


    tuple2 match{
        // 这里 tuple 元素位置类型需要要变量中元素类型对应
      case ("张三",_) => println("匹配到Tuple2 类型，且以张三开头")
      case ("李四",_) => println("匹配到Tuple2 类型，且以李四开头")
    }

    tuple3 match{
      // 这里 tuple 元素位置类型需要要变量中元素类型对应

      case (_,2,3) => println("匹配到Tuple3 类型，2位 3位元素值为 2 3")
      case (_,_,_) => println("匹配到Tuple3 类型，2位 3位元素值为 2 3")
    }
  }
}
