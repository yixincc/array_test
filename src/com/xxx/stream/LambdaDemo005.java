package com.xxx.stream;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaDemo005 {
    public static void main(String[] args) {
        //调用消费型接口方法
        testComsumer(20000, money -> System.out.println("每天消费" + money));
        //调用函数型接口
        System.out.println(strHandler(" asdgds  ", s -> s.trim()));
        System.out.println(strHandler("asfdasf     ", s -> s.toUpperCase()));
    }


    //消费型接口
    public static void testComsumer(double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    //函数型接口
    public static String strHandler(String str, Function<String, String> function) {
        return function.apply(str);
    }
}




