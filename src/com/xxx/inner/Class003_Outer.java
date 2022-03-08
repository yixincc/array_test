package com.xxx.inner;

public class Class003_Outer {
    int i=1;
    static int b=5;

    class Inner{
        int i=2;
        public void inner(){
            int i=3;


            //调用的是局部变量 inner方法中的变量i=3
            System.out.println(i);
            //调用的是内部类Inner作用的变量i=2
            System.out.println(this.i);
            //调用的外部类中的变量i
            Class003_Outer class003_outer = new Class003_Outer();
            System.out.println(class003_outer.i);

        }
    }

    public static void main(String[] args) {
        Class003_Outer.Inner in = new Class003_Outer().new Inner();
        in.inner();
    }

}
