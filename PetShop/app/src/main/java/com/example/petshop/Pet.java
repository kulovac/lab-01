package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    private String name;
    private Date birthdate;

    Pet(String name) {
        this.birthdate = new Date();
        this.name = name;
    }

    Pet(String name, Date birthdate) {
        this.birthdate = birthdate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public abstract String speak();
}
