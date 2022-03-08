package com.xxx.inner;

public class Inner {
    private int id;
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //内部类
    class Innertest{
        //属性
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        //方法
        public void eat() {
            System.out.println("内部类方法:"+name+"次饭！");
        }
    }

    public void eat() {
        System.out.println("外部类方法："+name+" 次饭！");
    }

}
