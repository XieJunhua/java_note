package com.junhua.design.pattern.observer;

/**
 * Created by xiejunhua on 2017/5/20.
 * 1.观察者模式(又叫发布订阅模式): 定义了一种一对多的关系依赖，让多个观察者对象同时监听某一个主题对象。
 * 这个主题对象在状态发生变化时，会通知所有观察者对象，使他们能够自动更新自己.
 * 2.将一个系统分隔成一系列互相协作的类有一个很不好的副作用，那就是需要维护相关的对象间的一致性。
 * 我们不希望为了维护这种一致性而使各类紧密耦合，这样会给维护，扩展和重用带来不便。这个时候观察者模式就起到作用了。
 * 3.当一个对象的改变需要同时改变其他对象，而且不知道具体有多少对象有待改变。应该考虑使用观察者模式。
 */
public class App {

    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        ConcreteObserver co1 = new ConcreteObserver(s, "x");
        ConcreteObserver co2 = new ConcreteObserver(s, "y");
        ConcreteObserver co3 = new ConcreteObserver(s, "z");


        s.attach(co1);
        s.attach(co2);
        s.attach(co3);

        s.setSubjectState("heiheihei");
        s.notifyObserver();
        s.detach(co3);
        s.setSubjectState("hahaha");
        s.notifyObserver();
        System.out.println(co3.getObserverState());

    }
}
