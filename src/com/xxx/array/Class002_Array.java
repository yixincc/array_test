package com.xxx.array;
/*
    一维数组:
        数组中放数据
    二维数组 :  了解
        数组中放数组

     声明 :
        数据类型[][] 数组名;  --> 推荐
        数据类型 数组名[][];
        数据类型[] 数组名[];

     初始化 : 创建及第一次赋值
        动态初始化 : 先创建数组,后赋值
            数据类型[][] 数组名 = new 数据类型[外层二维数组的长度][内层的每一个一维数组的程度];
            数据类型[][] 数组名 = new 数据类型[外层二维数组的长度][];
                数组名[二维索引] = new 数据类型[一维长度];
                ...

        静态初始化 : 创建数组的同时赋值
            数据类型[][] 数组名 = new 数据类型[][]{{1,2,3},{4,5},{6}...};
            数据类型[][] 数组名 = {{1,2,3},{4,5},{6}...};


     使用
        根据索引操作
        二维数组名[二维的索引][一维的索引]

     遍历
        双重for循环嵌套
            外层for循环遍历外层的二维数组,内存for循环用来遍历内层的每一个一维小数组
        增强for与普通for相互嵌套
            普通-->普通
            普通-->增强
            增强-->增强
            增强-->普通
 */
public class Class002_Array {
    public static void main(String[] args) {
        //动态初始化
        int[][] arr = new int[2][3];
        //赋值
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        //动态初始化
        String[][] arr2 = new String[2][];
        arr2[0] = new String[3];
        arr2[0][0] = "你";
        arr2[0][1] = "好";
        arr2[0][2] = "帅";

        arr2[1] = new String[]{"中","国"};

        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0][2]);
        System.out.println(arr2[1][0]);
        System.out.println(arr2[1][1]);

        //静态初始化
        int[][] arr3 = new int[][]{{1,2,3},{4,5},{6}};

        //静态初始化
        double[][] arr4 ={{1.1,2.2,3.3},{4.4,5.5},{6.5}};

        //遍历
        //普通-->普通
        //i 外层二维的索引
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){
                System.out.println(arr3[i][j]);
            }
        }

        //增强嵌套普通
        for(double[] a:arr4){
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]);
            }
        }

    }
}
