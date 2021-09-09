package com.rocketslab.aula10;

public class Mario extends Player{
    protected Yoshi yoshi;

    public Mario(String name, int age, double height) {
        super(name, age, height);
    }

    @Override
    public void growUp() {
        speak(this.name + " cresceu!");
        this.height *= 1.5;
    }

    public void yoshiMount(Yoshi yoshi) {
        this.yoshi = yoshi;
    }

    public void youshiMounted() {
        if (this.yoshi != null) {
            speak("Mario está montado no Yoshi!");
        } else {
            speak("Mario não está com Yoshi.");
        }
    }
}
