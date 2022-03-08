package com.xxx.util;

public class ArraysUtil {
    /**
     * 打印int类型数组
     *
     * @param arr
     */
    public static String ptintIntArrays(int[] arr) {
        // 需求 [1,2,3]

        String arrStr = "[";   //数组开头
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arrStr += arr[i] + "]";
            } else {
                arrStr += arr[i] + ",";
            }
        }
        return arrStr;
    }

    /**
     * 在数组指定索引处插入一个新值
     *
     * @param arr   原数组
     * @param index 索引
     * @param n     新值
     * @return
     */
    public static int[] insertArrayByIndex(int[] arr, int index, int n) {
        // 定义一个新数组，新数组的长度等于原数组加1
        int[] tamp = new int[arr.length + 1];
        //循环将原数组的前半部分插入至新数组
        for (int i = 0; i < index; i++) {
            tamp[i] = arr[i];
        }
        tamp[index] = n;
        for (int i = index; i < arr.length; i++) {
            tamp[i + 1] = arr[i];
        }
        return tamp;
    }

    /**
     * 获取数组最大值
     *
     * @param arr
     * @return
     */
    public static int getArrayMaxNum(int[] arr) {
        //假设第一位最大
        int max = arr[0];
        //数组遍历，找最大
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取数组最小值
     *
     * @param arr
     * @return
     */
    public static int getArrayMinNum(int[] arr) {
        //假设第一位最小
        int min = arr[0];
        //数组遍历，找最小
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 选择排序：将数组从小到大排序返回
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        //假设最小值是索引0
        int minIndex = 0;
        //临时变量，用来交替使用
        int temp = 0;
        for (int x = 0; x <= arr.length - 1; x++) {
            minIndex = x;
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[minIndex] > arr[y]) {
                    minIndex = y;
                }
            }
            if (minIndex != x) {
                temp = arr[x];//索引0的值取出给临时变量
                arr[x] = arr[minIndex];//把找出的最小值给arr[0]
                arr[minIndex] = temp;
            }
            System.out.println(ArraysUtil.ptintIntArrays(arr));
        }

        /*
        //第一轮
        //假设最小值是索引0
        int minIndex = 0;
        //临时变量，用来交替使用
        int temp = 0;
        //循环遍历数组 找到最小索引
        for (int i = 1; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        //替换位置
        temp = arr[0];//索引0的值取出给临时变量
        arr[0] = arr[minIndex];//把找出的最小值给arr[0]
        arr[minIndex] = temp;
        System.out.println(ArraysUtil.ptintIntArrays(arr));
        System.out.println("-----------------");

        //第二轮
        //假设最小值是索引0
        minIndex = 1;
        //临时变量，用来交替使用
        temp = 0;
        //循环遍历数组 找到最小索引
        for (int i = 2; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        //替换位置
        temp = arr[1];//索引0的值取出给临时变量
        arr[1] = arr[minIndex];//把找出的最小值给arr[0]
        arr[minIndex] = temp;
        System.out.println(ArraysUtil.ptintIntArrays(arr));
        System.out.println("-----------------");

        //第三轮
        //假设最小值是索引0
        minIndex = 2;
        //临时变量，用来交替使用
        temp = 0;
        //循环遍历数组 找到最小索引
        for (int i = 3; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        //替换位置
        temp = arr[2];//索引0的值取出给临时变量
        arr[2] = arr[minIndex];//把找出的最小值给arr[0]
        arr[minIndex] = temp;
        System.out.println(ArraysUtil.ptintIntArrays(arr));
    }
    */
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //int[] arr = {3, 7, 1, 9, 10, 5, 13};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(ArraysUtil.ptintIntArrays(arr));
    }
}
