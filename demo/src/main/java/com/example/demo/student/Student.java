package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private long id;
    private String name;
    private int age;
    private LocalDate ldb;
    private String gender;

    public Student() {
    }

    public Student(long id, String name, int age, LocalDate ldb, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ldb = ldb;
        this.gender = gender;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLdb(LocalDate ldb) {
        this.ldb = ldb;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getLdb() {
        return ldb;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", ldb=" + ldb +
                ", gender='" + gender + '\'' +
                '}';
    }
}


