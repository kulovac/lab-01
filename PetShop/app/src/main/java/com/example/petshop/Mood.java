package com.example.petshop;

import java.util.Date;

abstract public class Mood {
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Mood(Date date) {
        this.date = date;
    }

    public Mood() {
        this.date = new Date();
    }

    public abstract String currentMood();

    private Date date;

}
