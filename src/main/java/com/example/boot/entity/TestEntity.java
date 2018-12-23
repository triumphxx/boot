package com.example.boot.entity;

/**
 * Created by wang on 2018/12/23.
 */

public class TestEntity {
    private String name;

    private String sex;

    private int ege;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }

    public TestEntity(String name, String sex, int ege) {
        this.name = name;
        this.sex = sex;
        this.ege = ege;
    }
}
