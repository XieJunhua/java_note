package com.junhua.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiejunhua on 2017/5/20.
 * 具体主题类
 */
public class ConcreteSubject implements Subject {

    private List<Observer> list; //列表中保存所有订阅该主题的观察者

    private String subjectState; //主题状态

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    public ConcreteSubject() {
        this.list = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        if (list != null) {
            list.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        if (list != null) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        if (list != null) {
            for (Observer observer: list) {
                observer.update();
            }
        }

    }
}
