package com.rocketslab.aula03;

public class Mario {
    public String name;
    protected double height;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String powers = "Superhuman Strength, Superhuman Durability, Superhuman Stamina, Superhuman Speed";

    public Mario(){
        this.name = "Mario";
        this.height = 1.50;
        this.age = 40;
    }

    public void powers() {
        System.out.printf("Powers: %s\n", this.powers);
    }

    public void characteristics() {
        System.out.printf("Name: %s\nAge: %s\nHeight: %s\nStamina: %s\n", this.name, this.age, this.height);
    }
}
