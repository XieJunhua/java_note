package com.junhua

/**
  * @author junhua xjhclks@163.com
  * @date 2020/1/17 1:21 AM
  */
trait Animal {

  def talk:String

}

trait Cat extends Animal {
  override def talk: String = "cat"
}

trait Dog extends Animal {
  override def talk: String = "dog"
}
