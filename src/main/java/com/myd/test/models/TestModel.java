package com.myd.test.models;

import java.time.LocalDate;

public class TestModel {

    private String name;
    private Integer age;
    private LocalDate joiningDate;

    public TestModel(String name, Integer age, LocalDate joiningDate) {
        this.name = name;
        this.age = age;
        this.joiningDate = joiningDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

}
