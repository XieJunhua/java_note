package com.junhua.designmode.proxy;

/**
 * Created by xiejunhua on 2017/5/14.
 * 代理角色可以实现真实角色的功能是因为，代理角色中有真实角色的引用。
 */
public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }
    public ProxySubject() {

    }
    @Override
    public void request() {
        proxyDoSth();
        subject = subject == null ? new RealSubject() : subject;
        subject.request();
    }

    private void proxyDoSth() {
        System.out.println("proxy do sth");
    }
}
