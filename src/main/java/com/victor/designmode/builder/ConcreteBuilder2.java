package com.victor.designmode.builder;

/**
 * Created by xiejunhua on 2017/5/20.
 */
public class ConcreteBuilder2 implements Builder {

    private Product product;

    public ConcreteBuilder2() {
        this.product = new Product();
    }

    @Override
    public void buildPartA() {
        if (product != null) {
            product.add("x");
        }

    }

    @Override
    public void buildPartB() {
        if (product != null) {
            product.add("y");
        }

    }

    @Override
    public Product getResult() {
        return product;
    }
}
