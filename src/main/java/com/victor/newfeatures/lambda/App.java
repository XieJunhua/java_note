package com.victor.newfeatures.lambda;

import java.util.function.Function;

/**
 * Created by xiejunhua on 2017/6/6.
 */
public class App {

    private  String value = "Enclosing scope value";

    public static void main(String[] args) {
        App app = new App();

        /**da等价于
         * lamb
         * Foo foo = new Foo() {
         *    @Override
         *    public String method(String string) {
         *        retrun string + " heih";
         *    }
         */
        Foo foo = s -> s + "heih";

        Foo foo1 = string -> {
          return "";
        };


        String result = app.add("Message", s -> s + "heihei");
        System.out.println(result);

        Function<String, String> fn = p -> p + " from lambda";

        System.out.println(app.add1("Message", fn));

//        app.scopeExperiment();
//        System.out.println(String::length);




    }

    public String add(String string, Foo foo) {
        return foo.method(string);
    }

    public String add1(String string, Function<String, String> fn) {
        return fn.apply(string);
    }

    /**
     * 这个例子说明内部类和lambda在scope上是有区别的。
     */
    public void scopeExperiment() {
        Foo fooIc = new Foo() {
            String value = "Inner class value";
            @Override
            public String method(String string) {

                return this.value;
            }
        };

        String resultIC = fooIc.method("");

        Foo fooLambda = s -> {
            String value = "Lamdda value";
            return this.value;
        };
        String resultLambda = fooLambda.method("");

        System.out.println("resultIc: " + resultIC + " resultLambda: " + resultLambda);
    }
}
