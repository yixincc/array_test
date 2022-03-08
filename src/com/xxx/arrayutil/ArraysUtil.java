package com.xxx.arrayutil;

import java.util.Arrays;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] arr1 = {1,9,6,7,8,6,4};
        char[] arr2 = {'a','c','h','g','j'};

        int[][] arr3 = {{5,6,8},{4,7,3,2}};
        char[][] arr4 = {{'a','c','h'},{'g','j'}};
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.deepToString(arr4));

        //Arrays.fill(arr2,2,5,'y');
        //System.out.println(arr2);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.binarySearch(arr2, 'h'));
    }
}
