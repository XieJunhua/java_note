package com.victor.designmode.builder;

/**
 * Created by xiejunhua on 2017/5/18.
 * 建造模式: 又叫生成器模式。将一个复杂对象的构建与表示分离，使得同样的构建过程可以创建不同的表示。
 * 用户只需要指定需要建造的类型就可以得到他们，而具体的构建过程和细节就需要知道了。
 * 建造者隐藏了该产品是如何组装的，所以需要改变一个产品的内部表示，只需要再定义一个具体的构建者角色就可以了。
 * 主要用于创建一些复杂的对象，这些对象内部构建间的建造顺序通常稳定，但对象内部的构建通常面临着复杂的变化。
 * 当创建复杂对象的算法应该独立于该对象的组成部分以及他们的装配方式时适用的模式。
 */
public class App {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();
        Product p = builder1.getResult();
        p.show();
        director.Construct(builder1);
        p = builder1.getResult();
        p.show();

    }
}
