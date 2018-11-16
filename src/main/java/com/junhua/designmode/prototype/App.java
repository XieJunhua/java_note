package com.junhua.designmode.prototype;

import java.util.ArrayList;

/**
 * Created by xiejunhua on 2017/5/16.
 * 原型模式:用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * 使用原型模式创建对象比直接new一个对象在性能上要好的多，因为Object类的clone方法是一个本地方法，
 * 它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显。
 * 使用原型模式复制对象不会调用类的构造方法
 * 深拷贝和浅拷贝的问题 会发生深拷贝的有java中的8中基本类型以及他们的封装类型，另外还有String类型。其余的都是浅拷贝。
 */
public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setId(1);
        concretePrototype.setName("ss");
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        concretePrototype.setArrayList(arrayList);
        ConcretePrototype prototype = (ConcretePrototype)concretePrototype.clone();
        System.out.println(prototype.getArrayList());
        //改变arrayList, concretePrototype中的arrayList也会改变，证明是浅复制
        arrayList.add(2);
        System.out.println(concretePrototype.getArrayList());
        System.out.println(concretePrototype.getArrayList().equals(prototype.getArrayList()));//true
        prototype.show();
    }
}
