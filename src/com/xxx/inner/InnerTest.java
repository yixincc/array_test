package com.xxx.inner;

public class InnerTest {

    public static void main(String[] args) {
        Inner.Innertest in = new Inner().new Innertest();
        in.setName("李四");
        in.eat();
        Inner in2 = new Inner();
        in2.setName("张三");
        in2.eat();
    }
}
