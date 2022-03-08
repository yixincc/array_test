package com.xxx.array;

public class ArrayDemo09 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 4}, {7, 8}};
        //普通-》普通
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
        //增强-》普通
        for (int[] a : arr) {
            for (int i = 0; i < a.length; i++){
                System.out.print(a[i] + " ");
            }
        }


    }
}
