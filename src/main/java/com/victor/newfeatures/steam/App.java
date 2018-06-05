package com.victor.newfeatures.steam;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by xiejunhua on 2017/6/6.
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        app.method4();

    }

    public void method1() {
        String[] arr = new String[]{"a", "b", "c"};
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        Stream<String> stream = Arrays.stream(arr);

        stream.map(String::toUpperCase);
        Stream<String> listStream = list.stream();
        Stream<String> resultStream = listStream.map(String::toUpperCase);
//        System.out.println(resultStream.findFirst().get());
        System.out.println(resultStream.collect(Collectors.toList()));

//        System.out.println(Arrays.toString(arr));
    }

    public void method2() {
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").build();
//        streamBuilder.forEach(s -> {
//            System.out.println(s);
//        });
        System.out.println(streamBuilder.count());
    }

    private void method3() {
        ArrayList list = new ArrayList();
        Foo foo = new Foo();
        foo.setA(0);
        list.add(foo);
        list.add(foo);
        for (int i = 0; i < 10; i++) {
            list.add(foo);
        }
        Stream<Foo> fooStream = list.stream();

        fooStream.forEach(s -> s.add());

    }
    private void method4() {
        //hehe is behind thd 'do filter', because filter is lazy invocation. when collect()
        // was invoked, the filter method was invoked.
        Stream<String> s0 = Stream.of("a", "bddd", "ddbb", "c").filter(element -> {
            System.out.println("do filter");
            return element.contains("b");
        });
        System.out.println("hehe");
        List<String> elements = s0.collect(Collectors.toList());
        Stream<String> s1 = elements.stream();
        //skip会跳过前面的多少个数据，即抛弃前面的数据，不处理，不进入s2中
        Stream<String> s2 = s1.skip(1).map(String::toUpperCase);
        System.out.println(s2.collect(Collectors.toList()));
        //stream不能被重复使用
//        Optional<String> anyElement = s1.findAny();
//        Optional<String> firstElement = elements.stream().findFirst();
    }

}
