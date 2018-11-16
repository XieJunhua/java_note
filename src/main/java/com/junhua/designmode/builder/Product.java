package com.junhua.designmode.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiejunhua on 2017/5/20.
 * 产品类， 成员变量中的每个值代表product的一个组件。
 */
public class Product {

    private List<String> parts;

    public Product() {
        this.parts = new ArrayList<String>();
    }

    public void add(String part) {
        this.parts.add(part);
    }

    public void show() {
        System.out.println(parts);
    }


}
