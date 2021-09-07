package com.rocketslab.aula04;

public class Mario {
    private String name;
    private double height;
    private int age;
    private int stamina;

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

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    private String powers = "Superhuman Strength, Superhuman Durability, Superhuman Stamina, Superhuman Speed";

    public Mario(){
        this.name = "Mario Bros";
        this.height = 1.50;
        this.age = 40;
        this.stamina = 100;
    }

    public Mario(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.stamina = 100;
    }

    public void powers() {
        System.out.printf("Powers: %s\n", this.powers);
    }

    public void characteristics() {
        System.out.printf("Name: %s\nAge: %s\nHeight: %s\nStamina: %s\n", this.name, this.age, this.height, this.stamina);
    }
}
