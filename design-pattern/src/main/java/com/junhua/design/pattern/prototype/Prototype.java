package com.junhua.design.pattern.prototype;

import java.util.ArrayList;

/**
 * Created by xiejunhua on 2017/5/16.
 */
public class Prototype implements Cloneable {

    private int id;
    private String name;
    private ArrayList arrayList;

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        Prototype prototype = null;
        try {
            prototype = (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
