package com.leilei.demo30_seq

/**
 * @author lei
 * @date 2021/8/24 22:27
 * @version 1.0
 * @desc
 */
object SeqDemo01 {
  def main(args: Array[String]): Unit = {
    val seq: Range = (1 to 10).toSeq

    println(seq.size)
    println(seq(2))
    println(seq.apply(2))
  }

}
