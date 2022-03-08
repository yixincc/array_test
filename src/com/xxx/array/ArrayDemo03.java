package com.xxx.array;

import com.xxx.util.ArraysUtil;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2, 6, 9, 13};
        ArraysUtil.ptintIntArrays(arr);
        System.out.println("---------");
        int [] result = ArraysUtil.insertArrayByIndex(arr,2,20);
        ArraysUtil.ptintIntArrays(result);
        System.out.println("---------");
        System.out.println("数组最大值 = " + ArraysUtil.getArrayMaxNum(arr));
        System.out.println("---------");
        System.out.println("数组最小值 = " + ArraysUtil.getArrayMinNum(arr));
    }
}
