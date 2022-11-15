package com.example.mvcdemo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HelloModel {
    private ObservableList<Student> students;

    public HelloModel() {
        students = FXCollections.observableArrayList();
        students.add(new Student("Test1 Student", 11123456));
        students.add(new Student("Test2 Student", 11123457));
        students.add(new Student("Test3 Student", 11123458));
        students.add(new Student("Juan Dela Cruz", 11123459));
    }

    public ObservableList<Student> getStudents() {
        return students;
    }

    public void setStudents(ObservableList<Student> students) {
        this.students = students;
    }
}
