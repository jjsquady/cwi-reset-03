package com.rocketslab.aula09;

public abstract class Player {
    protected String name;
    protected double height;
    protected final int age;
    protected int stamina;
    protected int coins;
    protected int lives;

    private String powers = "Superhuman Strength, Superhuman Durability, Superhuman Stamina, Superhuman Speed";

    public Player(String name, int age, double height) {
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

    public void stats() {
        System.out.printf(
                "Player: { Name: %s, Age: %s, Height: %s, Stamina: %s, Coins: %s, Lives: %s }\n",
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

    public void jump() {
        if (this.name.equals("Mario") || this.name.equals("mario")) {
            System.out.println("Mario pulou " + this.height * 0.5 + " de altura.");
        }

        if (this.name.equals("Luigi") || this.name.equals("luigi")) {
            System.out.println("Luigi pulou " + this.height * 2 + " de altura.");
        }
    }

    public void speak(String message) {
        System.out.println(message);
    }
}
