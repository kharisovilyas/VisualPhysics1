package com.example.visualphysics;

public class Characteristics {
    private int honesty;
    private int mood;
    private int money;
    private int iq;

    public Characteristics(int honesty, int mood, int money, int iq) {
        this.honesty = honesty;
        this.mood = mood;
        this.money = money;
        this.iq = iq;
    }

    public void add(Characteristics delta){
        honesty+=delta.honesty;
        mood+=delta.mood;
        money+=delta.money;
        iq+=delta.iq;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getHonesty() {
        return honesty;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
