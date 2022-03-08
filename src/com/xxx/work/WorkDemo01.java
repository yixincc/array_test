package com.xxx.work;

import java.util.Scanner;

/**
 * 数组元素查找(查找指定元素第一次在数组中出现的索引)
 * 若存在:返回这个元素的下标
 * 若不存在:返回-1
 */
public class WorkDemo01 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 0, 1, 5, 0, 7, 10};
        System.out.println(findData(arr, 0));
        ;
    }

    public static int findData(int[] arr, int value) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if (value == arr[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    /*
       2.
       数组元素去0
       原数组: 4,2,8,0,1,5,0,7,10
       去0之后: 4,2,8,1,5,7,10
    */
    public static int[] chackZero(int[] arr) {
        //1)找到不为0数据的个数
        int count = 0;
        for (int i : arr) {
            if (i != 0) {
                count++;
            }
        }
        //2)判断原数组中是否存在0,不存在0直接返回原数组,存在0...
        if (count == arr.length) {
            return arr;
        }

        //3)存在0,创建新数组,长度为不为0数据的个数
        int[] newArr = new int[count];

        //4)不为0数据的拷贝
        //i作为原数组的索引
        int j = 0; //新数组索引
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != 0) {
                newArr[j++] = arr[i];
            }
        }
        //5)返回新数组
        return newArr;
    }


     /*
        3.将一个存放了大写字母的数组转换成存放小写字母的数组返回
     */

    public static char[] change(char[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A' && arr[i]<='Z'){
                arr[i]+=32;
            }
        }
        return arr;
    }

     /*
        4.
            练习: 定义员工类型,存储多个员工类型的数据
            1.展示输出所有员工信息
            2.找到所有员工的姓名存储起来
            3.找到所有薪资>10000的员工->裁员
            4.找到出现的员工年龄统计个数
     */


}

