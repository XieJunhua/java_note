package com.junhua.design.pattern.factory.simplefactory;

import com.junhua.design.pattern.factory.Operation;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class App {
    /**
     * 根据传入的参数不同，得到的实例不同。但是对于调用方(即客户端)来说，看上去他们是调用的同一个方法，得到不同的计算结果。
     */
    public static void main(String[] args) {
        Operation operation = OperationFactory.getOperation("/");
        System.out.println(operation.calculate(1, 2));
    }
}
