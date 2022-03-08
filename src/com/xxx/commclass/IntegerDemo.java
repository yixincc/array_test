package com.xxx.commclass;

public class IntegerDemo {
    public static void main(String[] args) {
        int i = 1;
        //自动装箱
        Integer in = i;
        //自动拆箱
        int i2 = in;


        int num1 = 127;
        int num2 = 127;
        System.out.println(num1 == num2);
        Integer num3 = 127;
        Integer num4 = 127;
        Integer num5 = new Integer(127);
        Integer num6 = new Integer(127);
        Integer num7 = 128;
        Integer num8 = 128;

        System.out.println(num3==num4);  //true
        System.out.println(num5==num6);  //false
        System.out.println(num7==num8);  //false
        System.out.println(num1==num3);  //true
        System.out.println(num5==num3);  //false
    }
}
