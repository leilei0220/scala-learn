package com.leilei.demo08_util

import java.text.SimpleDateFormat
import java.util.Date

/**
 * @author lei
 * @date 2021/7/5 20:40
 * @version 1.0
 * @desc
 */
object DateUtil {

  def date2Str(date:Date):String={
    var spf=new SimpleDateFormat("yyyy-MM-dd HH:mm:s")
    spf.format(date)
  }

  def date2Str(date:Date,format:String):String={
    new SimpleDateFormat(format).format(date)
  }

  def str2Date(dataStr:String):Date= {
    var sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    sdf.parse(dataStr)
  }
}
