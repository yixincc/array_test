package com.xxx.enumclass;

public class SeasonTest {
    public static void main(String[] args) {
        Season.SUMMER.info();
        Season[] ss = Season.values();

        for (Season s : ss){
            System.out.println(s);
        }

        switch (Season.WINTER) {
            case SPEING:
                Season.SPEING.info();
                break;
            case SUMMER:
                Season.SUMMER.info();
                break;
            case AUTUMU:
                Season.AUTUMU.info();
                break;
            case WINTER:
                Season.WINTER.info();
        }
    }

}
