package com.company.demo;

import java.util.Random;

public class User {
    private int userId;
    private String userName;
    int count;

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

    @Override
    public int hashCode() {
        int i = new Random().nextInt();
        count++;
        System.out.println("Random value"+i+"hashgenCount"+count);
        return i;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
