package com.xxx.array;

public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2, 6, 9, 13};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i] );
        }
        System.out.println("---------");
        for (int a : arr) {
            System.out.println("a = " + a);
        }
    }
}
