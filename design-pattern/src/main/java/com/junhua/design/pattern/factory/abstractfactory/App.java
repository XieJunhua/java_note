package com.junhua.design.pattern.factory.abstractfactory;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 10:42 AM
 * 抽象工厂模式:有一个大的抽象工厂，抽象工厂有具体的工厂实现。
 * 抽象工厂模式是在工厂方法上在进行了一次封装
 */
public class App {
  public static void main(String[] args) {
    HumanFactory male = new MaleHumanFactory();
    Human h1 = male.createWhiteHuman();
    h1.sayHi();
    Human h2 = male.createYellowHuman();
    h2.sayHi();

    HumanFactory female = new FemaleHumanFactory();
    female.createWhiteHuman().sayHi();
    female.createYellowHuman().sayHi();

  }
}
