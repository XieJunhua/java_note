package com.junhua.designmode.observer;

/**
 * Created by xiejunhua on 2017/5/20.
 * 具体观察者
 */
public class ConcreteObserver implements Observer {

    private String name;
    private String observerState;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.concreteSubject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        //获取主题状态，更新自己的状态
        setObserverState(concreteSubject.getSubjectState());
        System.out.println(String.format("观察者%s的新状态是%s", name, observerState));
    }

    public String getObserverState() {
        return observerState;
    }

    private void setObserverState(String observerState) {
        this.observerState = observerState;
    }
}
