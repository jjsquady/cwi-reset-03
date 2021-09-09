package com.rocketslab.aula10;

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
        mario.growUp();
        luigi.growUp();
        blueYoshi.growUp();
        mario.stats();
        luigi.stats();
        blueYoshi.stats();

        mario.jump();
        luigi.jump(3);
        blueYoshi.jump(4.2);

        log("----- GAME END ----");


    }
}
