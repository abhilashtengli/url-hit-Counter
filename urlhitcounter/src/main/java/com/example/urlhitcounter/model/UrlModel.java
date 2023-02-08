package com.example.urlhitcounter.model;

public class UrlModel {
    private String userName;
    private int count;


    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getCount() {
        return count;
    }
    @Override
    public String toString() {
        return "UrlModel [userName=" + userName + ", count=" + count + "]";
    }
    public void setCount(int count) {
        this.count = count;
    }


    
    public UrlModel(String userName, int count) {
        this.userName = userName;
        this.count = count;
    }
}
