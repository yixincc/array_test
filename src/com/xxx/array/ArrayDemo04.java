package com.xxx.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        ArrayDemo04 ad04 = new ArrayDemo04();
        ad04.arro1();

    }

    public void arro1() {
        int[][] arr = {{1, 3, 5}, {2, 4, 6}};
        System.out.println("arr[0][1] = " + arr[0][1]);
        System.out.println("arr[2][3] = " + arr[1][2]);
    }
}
