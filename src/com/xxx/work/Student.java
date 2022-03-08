package com.xxx.work;
//学生
public class Student {
    //属性
    private String name;
    private int age;
    private int id;

    //自定义属性
    private School school;
    //空构造
    public Student() {
    }
    //带参构造
    public Student(String name, int age, int id, School school) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.school = school;
    }
    //设置器访问器

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", school=" + school +
                '}';
    }
}
