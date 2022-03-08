package com.xxx.practice;
/*
    类与类之间的关系
        学生类 学校类型

        打印所有的学生信息以及学生所在学校信息
 */
public class Test {
    public static void main(String[] args) {
        School school1 = new School("鹤岗大学","1977-10-10","鹤岗市");
        School school2 = new School("香港大学","1978-10-10","香港市");
        School school3 = new School("连云港大学","1999-10-10","连云港市");
        Student[] arr = {
                new Student(1001,"zhangsan",18,school2),
                new Student(1002,"lisi",19,school1),
                new Student(1003,"wangwu",19,school1),
                new Student(1004,"zhaosi",20,school3),
        };

        for(Student s:arr){
            System.out.println(s);
        }
    }
}
