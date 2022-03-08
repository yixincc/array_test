package com.xxx.array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5}, {2, 4, 6}};
        for (int i = 0; i < arr.length; i++ ) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("arr[" + i +"][" + j + "] = " + arr[i][j]);
            }
        }
    }
}
