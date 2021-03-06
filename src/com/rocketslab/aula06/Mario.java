package com.rocketslab.aula06;

public class Mario {
    private String name;
    private double height;
    private final int age;
    private int stamina;
    private int coins;
    private int lives;

    private String powers = "Superhuman Strength, Superhuman Durability, Superhuman Stamina, Superhuman Speed";

    public Mario(){
        this.name = "Mario Bros";
        this.height = 1.50;
        this.age = 40;
        this.stamina = 100;
        this.coins = 0;
        this.lives = 1;
    }

    public Mario(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.stamina = 100;
        this.coins = 0;
        this.lives = 1;
    }

    public void powers() {
        System.out.printf("Powers: %s\n", this.powers);
    }

    public void characteristics() {
        System.out.printf(
                "Mario: { Name: %s, Age: %s, Height: %s, Stamina: %s, Coins: %s, Lives: %s }\n",
                this.name, this.age, this.height, this.stamina, this.coins, this.lives
        );
    }

    public void loseStamina() {
        this.stamina -= 10;
        if (this.stamina < 0) { this.stamina = 0; }
    }

    public void gainStamina() {
        this.stamina += 5;
        if (this.stamina > 100) { this.stamina = 100; }
    }

    public void growUp() {
        this.height = this.height * 2;
    }

    public void refresh() {
        this.stamina = 100;
    }

    public void collectCoin() {
        this.coins++;

        if (this.coins % 10 == 0) {
            this.lives++;
        }
    }

    public void die() {
        this.lives--;

        if (this.lives >= 0) {
            this.refresh();
        } else {
            this.lives = 0;
            this.stamina = 0;
        }
    }
}
