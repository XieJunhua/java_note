package com.junhua

import java.sql.{Connection, DriverManager}

/**
  * @author junhua xjhclks@163.com
  * @date 2020/1/10 12:52 AM
  */
object Test1 {

  def main(args: Array[String]): Unit = {

    val p1 = new Point2(1,2)
    println(p1.toString)
    println(p1.hashCode())
    println(p1.##)

//    val username:Option[String] = Some("abc")
//    val username:Option[String] = None
//
//    for (name <- username;i <- 1 to 5) {
//      println(name)
//      println(i)
//    }
    println(foo(one = 4))

    val a = new Dog  with Cat
    print(a.talk)

  }

  def foo(one:Int = 1, two:Int = 2, three:String = "three"): String = {
    one + two + three
  }

  def creatConnection(connUrl: Option[String],
                      connUser: Option[String],
                      connPw: Option[String]): Option[Connection] = {
    for {
      url <- connUrl
      user <- connUser
      pw <- connPw
    } yield DriverManager.getConnection(url, user, pw)
  }

  def lift3[A,B,C,D](f:Function3[A,B,C,D]) = (oa:Option[A], ob:Option[B], oc:Option[C]) => for (a <- oa; b <- ob; c<- oc) yield f(a,b,c)



}
