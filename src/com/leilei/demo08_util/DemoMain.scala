package com.leilei.demo08_util

import java.util.Date

/**
 * @author lei
 * @date 2021/7/5 20:43
 * @version 1.0
 * @desc
 */
object DemoMain {
  def main(args: Array[String]): Unit = {
    println(DateUtil.date2Str(new Date()))
    Thread.sleep(1000)
    println(DateUtil.date2Str(new Date))
    Thread.sleep(1000)
    println(DateUtil date2Str new Date)
    Thread.sleep(1000)
    println(DateUtil date2Str (new Date,"yyyy_MM_dd_HH:mm:ss"))

    Thread.sleep(1000)
    println(DateUtil.date2Str(new Date(),"yyyy-MM-dd"))

    Thread.sleep(1000)
    println(DateUtil.str2Date("2020-01-01 13:46:245"))
  }
}
