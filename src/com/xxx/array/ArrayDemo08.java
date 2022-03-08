package com.xxx.array;

import com.xxx.util.ArraysUtil;

import java.util.Arrays;

public class ArrayDemo08 {
    public static void main(String[] args) {
       int[] arr = {3, 7, 1, 9, 10, 5, 13}; // int[] arr = {1,2,3,4,6,9,13}
       // Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
        System.out.println(ArraysUtil.ptintIntArrays(arr));
        System.out.println("-------------");
      //  ArraysUtil.selectSort(arr);
        ArraysUtil.bubbleSort(arr);
    }
}
