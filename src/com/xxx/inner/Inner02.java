package com.xxx.inner;

public class Inner02 {
    public static void main(String[] args) {
        //一次
        new Smoks() {
            @Override
            public void Smoking() {

                System.out.println("一边抽烟，一边看手机");
            }
        }.Smoking();
      //多次

        Smoks smoks = () ->  System.out.println("一边抽烟，一边看电视");

        smoks.Smoking();
        smoks.Smoking();
        smoks.Smoking();

        //匿名内部类
        testSmok(new Smoks() {
            @Override
            public void Smoking() {

                System.out.println("一边吸烟，-----");
            }
        });

        }
    public static void testSmok(Smoks smoks) {
        smoks.Smoking();
    }
}
interface Smoks{
    void Smoking();
}

class Smoking implements Smoks{

    @Override
    public void Smoking() {
        System.out.println("一遍敲代码，一遍抽烟");
    }
}


