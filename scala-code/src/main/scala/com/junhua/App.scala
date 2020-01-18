package com.junhua

/**
  * @author junhua xjhclks@163.com
  * @date 2019/12/27 12:50 AM
  */
object App {
  def main(args: Array[String]): Unit = {
    val nums = List(1,2,3,4,5,6)
//    println(filter(nums, dividesBy(2)))
    println(nums.head)
    println(nums.tail)
  }


  /**
    * 递归的方式实现筛选的功能
    * @param xs
    * @param p
    * @return
    */
  def filter(xs:List[Int], p:Int => Boolean): List[Int] = {
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p)
  }

  def dividesBy(n:Int)(x:Int) = (x % n) == 0

}
