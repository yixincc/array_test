package com.xxx.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exception01 {
    public static void main(String[] args) {
        System.out.println("-----开始-----");
        try {
            System.out.println("try开始了");
            test();
            System.out.println("try结束了");
        }catch (FileNotFoundException e) {
            System.out.println("文件找不到！");
        }
    }


    public static void test() throws FileNotFoundException {
        InputStream in = new FileInputStream("D://test.txt");
    }
}
