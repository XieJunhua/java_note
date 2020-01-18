package com.junhua

/**
  * @author junhua xjhclks@163.com
  * @date 2020/1/10 12:52 AM
  */
class Point2(var x:Int, var y:Int) {

  def move(mx:Int, my:Int): Unit = {
    x = x + mx
    y = y + my
  }
}
