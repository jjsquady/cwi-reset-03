package com.rocketslab.aula05;

import com.rocketslab.aula06.Mario;
import com.rocketslab.interfaces.TestContract;

public class Test extends TestContract {
    public static void main(String[] args) {
        com.rocketslab.aula06.Mario marioA = new com.rocketslab.aula06.Mario();

        Log("\n-------- SUPER MARIO BROS (AULA 03)-----------");
        marioA.powers();
        marioA.characteristics();
        Log("");

        Log("\n-------- SUPER LUIGI BROS v2 (AULA 04) -----------");
        com.rocketslab.aula06.Mario marioB = new com.rocketslab.aula06.Mario("Luigi", 36, 1.45);
        marioB.powers();
        marioB.characteristics();
        Log("");

        Log("\n-------- SUPER MARIO BROS (AULA 05) -----------");
        com.rocketslab.aula06.Mario marioC = new Mario();
        Log("---- Testa Mario perdendo stamina");
        marioC.loseStamina();
        marioC.characteristics();
        marioC.loseStamina();
        marioC.characteristics();
        Log("");

        Log("---- Testa Mario ganhando stamina");
        marioC.gainStamina();
        marioC.characteristics();
        Log("");

        Log("---- Testa Mario crescendo");
        marioC.growUp();
        marioC.characteristics();
        Log("");
    }
}
