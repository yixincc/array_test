package com.xxx.Laman;
/*
    Lambda表达式
        简化匿名内部类对象

    语法:
        ()->{}
        ()->重写方法的参数列表
        -> : 箭头函数 lambda符号
        {}->重写方法的方法体

    前提:
        函数式接口为前提 : 只有一个必须被重写的抽象方法的接口
        强制检测是否为函数式接口 : FunctionalInterface

 */
public class Class001_Lambda {
    public static void main(String[] args) {
        //匿名内部类对象
        /*Swim swim = new Swim(){

            @Override
            public void swimming() {
                System.out.println("一边游泳一边喝水!!!!");
            }
        };*/

        //lambda表达式写法1
        /*Swim swim = ()->{
            System.out.println("一边游泳吐泡泡!!!!");
        };*/

        //lambda表达式写法2 : 如果{}中方法体语句只有一句,前后的{}可以省略
        //Swim swim = ()-> System.out.println("一边游泳吐泡泡!!!!");

        //lambda表达式写法3 : 如果存在参数,参数的数据类型可以省略
        //Swim swim = (name)-> System.out.println(name+"一边游泳吐泡泡!!!!");

        //lambda表达式写法4 : 如果存在参数,参数只有一个,参数列表前后()可以省略
        //Swim swim = s -> System.out.println(s+"一边游泳吐泡泡!!!!");

        //lambda表达式写法5 :如果方法存在返回值,并且方法体语句只有一句,就是return语句,前后的{}与return关键字可以一起省略
        Swim swim = i -> i>18;

        System.out.println(swim.swimming(19));;

        test(new Swim(){

            @Override
            public boolean swimming(int age) {
                return age>20;
            }
        });

        test((int age) -> {
            return age>20;
        });

        test(age -> age>20);
    }

    static void test(Swim swim){
        swim.swimming(20);
    }
}


@FunctionalInterface
interface Swim{
    boolean swimming(int age);
}