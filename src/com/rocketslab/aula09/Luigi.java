package com.rocketslab.aula09;

public class Luigi extends Player{
    public Luigi(String name, int age, double height) {
        super(name, age, height);
    }

    public void fly() {
        speak("Luigi está voando!");
    }
}
