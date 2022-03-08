package com.xxx.array;

public class ArrayDemo06 {
    public static void main(String[] args) {
        //二维数组累加
        int arr[][] = {{11}, {21, 22}, {31, 32, 33}};
        // 每一个一维数组的总和，和二维数组的总和
        int total = 0;
        int singleTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                singleTotal += arr[i][j];
            }
            System.out.println("第" + i + "个一维数组的总和是" + singleTotal);
            total += singleTotal;
            singleTotal = 0;
        }
        System.out.println("二维数组的总和是" + total);
    }
}
