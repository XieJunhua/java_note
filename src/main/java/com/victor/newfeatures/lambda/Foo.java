package com.victor.newfeatures.lambda;

/**
 * Created by xiejunhua on 2017/6/6.
 */
@FunctionalInterface
public interface Foo {
    String method(String string);

    //加了@FunctionalInterface后, 只支持一个方法
    //@FunctionalInterface相当于一个验证，验证接口中是不是只有一个接口
//    int m1(int i);
    //可以增加默认方法
    default void defaultMethod() {

    }

}
