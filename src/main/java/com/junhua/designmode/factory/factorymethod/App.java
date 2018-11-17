package com.junhua.designmode.factory.factorymethod;

import com.junhua.designmode.factory.AddOperation;
import com.junhua.designmode.factory.DivOperation;
import com.junhua.designmode.factory.Operation;

/**
 * Created by xiejunhua on 2017/5/16.
 * 简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，
 * 对于客户端来说，去除了与具体产品相关的类。我们需求变更，就需要增加或者修改逻辑判断了，这违背了开放封闭原则，于是工厂方法模式就出现了.
 * 工厂方法定义: 定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类中
 */
public class App {

  public static void main(String[] args) {
    //在简单工厂的那个例子上构造了工厂方法模式的例子。当我需要新增计算规则的时候只需要新增一个对应的工厂，和一个对应的操作实现就可以了，而不是去修改简单工厂中的判断逻辑。
    //同时，将简单工厂中判断逻辑放到了客户端中，由客户端主动选择初始化哪个工厂，使用哪个计算。
    OperationCreateFactory operationFactory = new AddOperationFactory();
    Operation operation = operationFactory.crateOperation();
    System.out.println(operation.calculate(1, 2));
    System.out.println(operationFactory.createOperation(DivOperation.class).calculate(1, 2));


  }
}
