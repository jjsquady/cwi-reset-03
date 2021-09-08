package com.rocketslab.aula09;

public class Yoshi extends Player{

    private int fruitEat;
    private int speed;

    public Yoshi(String name, int age, double height) {
        super(name, age, height);

        fruitEat = 0;
        speed = 10;
    }

    public int getSpeed() {
        return speed;
    }

    public void eatFruit() {
        fruitEat++;

        if(fruitEat % 2 == 0) {
            speed *= 2;
        }

        speak(name + " comeu uma fruta!");
    }

    public void stats() {
        System.out.printf(
                "Player: { Name: %s, Age: %s, Height: %s, Speed: %s, Fruits: %s }\n",
                this.name, this.age, this.height, this.speed, this.fruitEat
        );
    }
}
