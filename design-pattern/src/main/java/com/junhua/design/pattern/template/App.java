package com.junhua.design.pattern.template;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 11:29 AM
 * 模板方法模式，或者模板模式
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * 可以将一些子类中通用的代码提取到模板方法中。常用抽象类来完成，java8 中接口增加了默认实现，也可以用接口来实现
 */
public class App {
  public static void main(String[] args) {
    Game game = new FootballGame();
    game.enroll();
    new BasketballGame().enroll();
  }
}
