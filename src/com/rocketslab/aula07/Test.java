package com.rocketslab.aula07;

import com.rocketslab.interfaces.TestContract;

public class Test extends TestContract {
    public static void main(String[] args) {
        Log("------------ SUPER MARIO BROS (AULA 07) -------------\n");

        Player mario = new Player("Mario", 40, 1.52);
        Player luigi = new Player("Luigi", 38, 1.80);

        mario.stats();
        mario.jump();
        Log("");
        luigi.stats();
        luigi.jump();
    }
}
