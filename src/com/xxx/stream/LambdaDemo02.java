package com.xxx.stream;

import java.util.Locale;

public class LambdaDemo02 {
    public static void main(String[] args) {

        System.out.println(strHandler("abcd", str -> str.toUpperCase(Locale.ROOT)));
        System.out.println(strHandler("hdghashg", str -> str.substring(1, 4)));
        System.out.println(strHandler("xxxxxx", str -> str.toUpperCase()));



    }


    public String strHanders(String s) {
        return s.toUpperCase(Locale.ROOT);
    }

    //对字符串处理方法
    public static String strHandler(String str, MyFunction function) {
        return function.getValue(str);
    }
}

//函数式接口
@FunctionalInterface
interface MyFunction {
    public String getValue(String str);
}
