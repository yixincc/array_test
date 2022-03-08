package com.xxx.enumclass;

import java.util.Arrays;

public class EnumDemo {
    public static void main(String[] args) {
        WeekDay sun = WeekDay.SUN;
        sun.setName("周天");
        WeekDay sun1 = WeekDay.Mon;

        System.out.println(sun.getName());
        System.out.println(sun.ordinal());
        System.out.println(Arrays.toString(sun.values()));

        switch (sun1) {
            case Mon:
                System.out.println("今天周一");
                break;
            case THUS:
                System.out.println("今天周二");
                break;
            case SUN:
                System.out.println("今天周天");
        }
    }
}

enum WeekDay{
    Mon("周一"),THUS("周二"),SUN;

    //属性
    private String name;
    //构造器

    WeekDay() {
    }

    WeekDay(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
