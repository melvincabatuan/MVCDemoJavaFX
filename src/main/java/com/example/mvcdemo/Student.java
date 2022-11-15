package com.example.mvcdemo;

public class Student {
    private int idNumber;
    private String name;

    public Student() { // default
    }

    public Student(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + idNumber + ": " + name;
    }
}
