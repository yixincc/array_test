package com.xxx.inner;

public class JubuInter {

    int i = 1;

    public void interM() {
        int a = 5;

        class Inter{
            public void inter() {
                System.out.println(a);
                System.out.println(i);
            }


        }

        Inter inter = new Inter();
        inter.inter();
    }


}
