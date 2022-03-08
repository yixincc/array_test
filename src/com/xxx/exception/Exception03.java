package com.xxx.exception;

public class Exception03 {
    public static void main(String[] args) {
        User user = new User();
        user.setUserId(10001);
        user.setUserName("大白");
        try {
            user.setAge(18);
        } catch (AgeException e) {
            try {
                user.setAge(15);
            } catch (AgeException ageException) {
                ageException.printStackTrace();
            }
        }

    }
}

class AgeException extends RuntimeException {
    public AgeException() {

    }
    public AgeException(String message) {

    }

}
class User{
    //属性
    private int userId;
    private String userName;
    private int age;
    //构造器
    public User() {
    }

    public User(int userId, String userName, int age) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AgeException{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}

