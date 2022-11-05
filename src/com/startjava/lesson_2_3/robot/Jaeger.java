package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String name;
    private String mark;
    private double height;
    private double weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {}

    public Jaeger(String name, String mark, double height, double weight, int speed, int strength, int armor) {
        this.name = name;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return this.armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    
    public void move() {
        System.out.println("Идти");
    }

    public void run() {
        System.out.println("Бежать");
    }

    public void jump() {
        System.out.println("Прыгать");
    }

    public void kill() {
        System.out.println("Убивать");
    }
}
