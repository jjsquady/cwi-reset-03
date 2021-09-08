package com.rocketslab.aula09;

import com.rocketslab.Main;
import com.rocketslab.interfaces.TestContract;

public class Test extends TestContract {
    public static void main(String[] args) {

        Mario mario = new Mario("Mario", 40, 1.52);
        Luigi luigi = new Luigi("Luigi", 38, 1.80);
        Yoshi blueYoshi = new Yoshi("Yoshi Azul", 3, 2);

        log("-------- SUPER MARIO GAME ---------");
        mario.stats();
        luigi.stats();
        blueYoshi.stats();

        log("----------- GAME START ------------");
        mario.marioMounted();
        mario.yoshiMount(blueYoshi);
        mario.marioMounted();

        luigi.fly();

        blueYoshi.speak("Velocidade do Yoshi speed é " + blueYoshi.getSpeed());
        blueYoshi.eatFruit();
        blueYoshi.eatFruit();
        blueYoshi.eatFruit();
        blueYoshi.stats();

        blueYoshi.speak("Velocidade do Yoshi speed é " + blueYoshi.getSpeed());

        log("----- GAME END ----");


    }
}
