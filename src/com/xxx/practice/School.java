package com.xxx.practice;
//学校
public class School {
    private String name;
    private String date;
    private String location;

    public School() {
    }

    public School(String name, String date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
