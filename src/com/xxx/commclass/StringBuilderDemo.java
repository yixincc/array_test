package com.xxx.commclass;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("xixihaha");
        System.out.println(sb2);

        System.out.println(sb1.capacity());
        System.out.println(sb2.capacity());

        sb1.append(123);
        System.out.println(sb1.append(false));
        System.out.println(sb1.append("nihaoaac"));
        System.out.println(sb1.append("a"));
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        System.out.println(sb1.delete(0,3));
        System.out.println(sb1);
    }
}
