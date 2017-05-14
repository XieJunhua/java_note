package com.victor.designmode.wrapper.v2;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class Finery extends Person {
    private Person person;

    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
