package com.xxx.commclass;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);


        String str2 = new String("你好");
        System.out.println(str2);

        String str3 = new String(new char[] {'a','b','c','d','f'});
        System.out.println(str3);

        String str4 = new String(new char[] {'a','b','c','d','f'},2,2);
        System.out.println(str4);

    }
}
