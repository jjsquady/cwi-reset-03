package com.rocketslab.aula10;

public class Luigi extends Player {
    public Luigi(String name, int age, double height) {
        super(name, age, height);
    }

    @Override
    public void growUp() {
        speak(this.name + " cresceu!");
        this.height *= 1.75;
    }

    public void fly() {
        speak("Luigi está voando!");
    }
}
