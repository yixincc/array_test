package com.xxx.work;


public class StudentTest {
    public static void main(String[] args) {
        School school1 = new School("北京大学",1889,"北京市");
        School school2 = new School("上海大学",1969,"上海市");
        School school3 = new School("南京大学",1965,"南京市");
        School school4 = new School("皖江工学院",1999,"马鞍山市");
        School school5 = new School("哈尔滨佛学院",0111,"哈尔滨市");

        Student[] arr = {
                new Student("张三",18,1001,school2),
                new Student("李四",19,1002,school1),
                new Student("王五",20,1003,school3),
                new Student("赵六",20,1003,school5),
                new Student("哈哈",20,1003,school4),
        };

        for (Student s : arr){
            System.out.println(s);
        }
    }

}
