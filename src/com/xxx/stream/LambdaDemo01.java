package com.xxx.stream;

import com.xxx.pojo.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaDemo01 {
    public static void main(String[] args) {
        List<Employee> list =  Arrays.asList(
                new Employee(22,"lisi",8888.8),
                new Employee(29,"zhaoliu",10000.2),
                new Employee(24,"wangwu",9999.9)

        );

        list.sort((Employee o1,Employee o2) -> o1.getAge().compareTo(o2.getAge()));
        System.out.println(list);
//        //比较年龄 年龄相同比较姓名
//        Collections.sort(list,(x,y)->{
//            if (x.getAge() == y.getAge()){
//                return x.getName().compareTo(y.getName());
//            }
//            return Integer.compare(x.getAge(),y.getAge());
//        });
//        System.out.println(list);



    }
}
