package com.xxx.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        ArrayDemo01 arr01 = new ArrayDemo01();
        arr01.arr01();
        arr01.arr02();
    }

    public void arr01() {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println("arr[2] = " + arr[2]);
    }

    public void arr02() {
        String[] arr = new String[]{"中国", "加油"};
        System.out.println("arr[1] = " + arr[1]);
    }

    public void arr03() {

        double[] arr = new double[8];
    }
}