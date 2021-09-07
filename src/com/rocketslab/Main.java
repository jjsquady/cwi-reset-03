package com.rocketslab;

import com.rocketslab.aula05.Mario;

public class Main {

    public static void main(String[] args) {
	    Mario marioA = new Mario();

        System.out.println("\n-------- SUPER MARIO BROS (AULA 03)-----------\n");
        marioA.powers();
        marioA.characteristics();

        System.out.println("\n-------- SUPER LUIGI BROS v2 (AULA 04) -----------\n");
        Mario marioB = new Mario("Luigi", 36, 1.45);
        marioB.powers();
        marioB.characteristics();

        System.out.println("\n-------- SUPER MARIO BROS (AULA 05) -----------\n");
        Mario marioC = new Mario();
        System.out.println("Lose stamina...");
        marioC.loseStamina();
        marioC.characteristics();

        System.out.println("Gain stamina...");
        marioC.gainStamina();
        marioC.characteristics();

        System.out.println("Growup!!...");
        marioC.growUp();
        marioC.characteristics();
    }
}
