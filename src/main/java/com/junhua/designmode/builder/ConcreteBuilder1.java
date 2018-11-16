package com.junhua.designmode.builder;

/**
 * Created by xiejunhua on 2017/5/20.
 * 具体的构造类1 关键点在于 具体构造类中有product的对象，可以直接操作实际的product对象
 */
public class ConcreteBuilder1 implements Builder {

    private Product product;

    public ConcreteBuilder1() {
        this.product = new Product();
    }

    @Override
    public void buildPartA() {
        if (product != null) {
            product.add("A");
        }
    }

    @Override
    public void buildPartB() {
        if (product != null) {
            product.add("B");
        }
    }

    @Override
    public Product getResult() {
        return product;
    }
}
