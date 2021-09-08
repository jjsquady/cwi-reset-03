package com.rocketslab.aula09;

import org.w3c.dom.ls.LSOutput;

public class Mario extends Player{
    private Yoshi yoshi;

    public Mario(String name, int age, double height) {
        super(name, age, height);
    }

    public void yoshiMount(Yoshi yoshi) {
        this.yoshi = yoshi;
    }

    public void marioMounted() {
        if (this.yoshi != null) {
            speak("Mario está montado no Yoshi!");
        } else {
            speak("Mario não está com Yoshi.");
        }
    }
}
