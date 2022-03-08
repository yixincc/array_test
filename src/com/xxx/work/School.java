package com.xxx.work;

public class School {
    //属性
    private String name;
    private int date;
    private String location;
    //构造器
    public School() {
    }
    //带参构造
    public School(String name, int date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }
    //设置器，访问器

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", location='" + location + '\'' +
                '}';
    }
}
