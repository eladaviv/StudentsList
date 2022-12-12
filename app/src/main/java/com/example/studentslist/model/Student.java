package com.example.studentslist.model;

public class Student {
    String name;
    String id;
    String phone;
    String address;
    int avatar;
    boolean flag;

    public Student(String name, String id,String phone,String address, boolean flag,int avatar) {
        this.name = name;
        this.id = id;
        this.address=address;
        this.phone = phone;
        this.flag = flag;
        this.avatar = avatar;

    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {

        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
