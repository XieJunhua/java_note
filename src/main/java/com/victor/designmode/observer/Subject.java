package com.victor.designmode.observer;

/**
 * Created by xiejunhua on 2017/5/20.
 * 抽象主题类，定义了新增，删除观察者，和发送通知的方法
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}
