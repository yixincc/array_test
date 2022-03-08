package com.xxx.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7};
        ArrayDemo02 arr02 = new ArrayDemo02();
        arr02.printEscArray(arr);
        System.out.println("---------");
        arr02.printDescArray(arr);

    }

    public void printEscArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }

    public void printDescArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
