package com.xxx.array;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Arrays 静态工厂
        封装了一些操作数组的功能
 */
public class Class003_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {3,1,5,4,2};
        int[] arr2 = {3,1,5,4,2};

        char[][] arr3 = {{'a','b'},{'c','d','e'}};
        char[][] arr4 = {{'a','b'},{'c','d','e'}};

        //static String toString(int[] a) 返回指定数组内容的字符串表示形式。
        System.out.println(Arrays.toString(arr1));
        //static boolean equals(int[] a, int[] a2) 如果两个指定的int数组彼此 相等 ，则返回 true 。
        System.out.println(arr1==arr2);
        System.out.println(Arrays.equals(arr1,arr2));

        //针对于多维数组
        //static boolean deepEquals(Object[] a1, Object[] a2) 如果两个指定的数组彼此 深度相等 ，则返回 true 。
        System.out.println(Arrays.equals(arr3,arr4));
        System.out.println(Arrays.deepEquals(arr3,arr4));

        //static String deepToString(Object[] a) 返回指定数组的“深层内容”的字符串表示形式。
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.deepToString(arr3));

        //static void fill(boolean[] a, boolean val) 将指定的布尔值分配给指定的布尔数组的每个元素。
        //static void fill(boolean[] a, int fromIndex, int toIndex, boolean val) 将指定的布尔值分配给指定的布尔数组的指定范围的每个元素。  结束索引位置不包含
        boolean[] arr5 = new boolean[10];
        System.out.println(Arrays.toString(arr5));
        Arrays.fill(arr5,true);
        System.out.println(Arrays.toString(arr5));
        Arrays.fill(arr5,3,6,false);
        System.out.println(Arrays.toString(arr5));

        //static void sort(int[] a) 将指定的数组按升序排序。
        //static void sort(int[] a, int fromIndex, int toIndex) 按升序对数组的指定范围进行排序。
        System.out.println(Arrays.toString(arr1));
        //Arrays.sort(arr1);
        Arrays.sort(arr1,1,4);
        System.out.println(Arrays.toString(arr1));

        //自行测试对字符数组|字符串数组默认升序排序

        //static int binarySearch(int[] a, int key) 使用二进制搜索算法在指定的int数组中搜索指定的值。如果不存在返回-插入点-1  --> 默认数组升序排序为前提
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println( Arrays.binarySearch(arr2,6));;  //-插入点-1
    }
}
