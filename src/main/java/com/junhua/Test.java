package com.junhua;


import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by xiejunhua on 2017/5/26.
 */
public class Test {

    public static void main(String[] args) {

        ArrayBlockingQueue<String> q1 = new ArrayBlockingQueue<String>(10);

        Student s1 = new Student("xiaoming", 12);

        List list1 = Lists.newArrayList(s1);
        System.out.println(list1);
        s1.setAge(13);
        System.out.println(list1);


        q1.add("t");
        q1.add("t2");

        List list = Lists.newArrayList(q1);

        list.add("t3");

        System.out.println(q1);






    }


}

class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
