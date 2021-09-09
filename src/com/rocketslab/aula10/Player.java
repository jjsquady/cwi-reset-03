package com.rocketslab.aula10;

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
                this.name, this.age, String.format("%.2f", this.height), this.stamina, this.coins, this.lives
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

    public abstract void growUp();

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
        speak(this.name + " saltou " + String.format("%.2f", this.height * 0.5) + " de altura.");
    }

    public void jump(double aheadObject) {
        String jumped = String.format("%.2f", aheadObject * 1.5);
        speak(this.name + " saltou " + jumped + " de altura.");
    }

    public void speak(String message) {
        System.out.println(message);
    }
}
