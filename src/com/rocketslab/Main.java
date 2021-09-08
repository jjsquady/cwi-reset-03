package com.rocketslab;

import com.rocketslab.aula06.Mario;
import com.rocketslab.aula08.Aula08Test;
import com.rocketslab.aula08.Player;

public class Main {

    public static void main(String[] args) {
        (new Aula08Test()).run();
    }

    /* ***************************************************************************************
        Método estático para executar os passos descritos na aula 05
     ****************************************************************************************/
    public static void runLesson05() {
        Mario marioA = new Mario();

        Log("\n-------- SUPER MARIO BROS (AULA 03)-----------");
        marioA.powers();
        marioA.characteristics();
        Log("");

        Log("\n-------- SUPER LUIGI BROS v2 (AULA 04) -----------");
        Mario marioB = new Mario("Luigi", 36, 1.45);
        marioB.powers();
        marioB.characteristics();
        Log("");

        Log("\n-------- SUPER MARIO BROS (AULA 05) -----------");
        Mario marioC = new Mario();
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

    /* ***************************************************************************************
        Método estático para executar os passos descritos na aula 06
     ****************************************************************************************/
    public static void runLesson06() {
        Mario marioA = new Mario();

        Log("\n-------- SUPER MARIO BROS (AULA 06)-----------");
        Log("---- Mario start!");
        marioA.characteristics();

        Log("");
        Log("---- Testa Mario revigorando stamina");
        marioA.loseStamina();
        marioA.loseStamina();
        marioA.characteristics();
        marioA.refresh();
        marioA.characteristics();

        Log("");
        Log("---- Testa Mario morreu");
        Mario marioDie = new Mario();
        marioA.characteristics();
        marioA.die();
        marioA.characteristics();

        Log("");
        Log("---- Testa Mario coletando moedas e ganhando uma vida");
        Mario marioCoin = new Mario();
        marioCoin.characteristics();
        // ***************************************************************************************
        // Monta um laço de repetição de 0 até 9 para fazer Mario ganhar 10 moedas e uma vida
        // ***************************************************************************************
        for (int i=0; i < 10; i++) {
            marioCoin.collectCoin();
        }
        marioCoin.characteristics();
        Log("\n---- Testa Mario perde as vidas que ganhou");
        marioCoin.die();
        marioCoin.characteristics();
        marioCoin.die();
        marioCoin.characteristics();
        marioCoin.die();
        Log("\n---- Mario mais uma vida zerando vidas e stamina");
        marioCoin.characteristics();
    }

    /* ***************************************************************************************
        Método estático para executar os passos descritos na aula 07
     ****************************************************************************************/
    public static void runLesson07() {

        Log("------------ SUPER MARIO BROS (AULA 07) -------------\n");

        Player mario = new Player("Mario", 40, 1.52);
        Player luigi = new Player("Luigi", 38, 1.80);

        mario.stats();
        mario.jump();
        Log("");
        luigi.stats();
        luigi.jump();
    }

    // ***************************************************************************************
    // Método pra simplificar a escrita no console (abstração de System.out.println)
    // ***************************************************************************************
    public static void Log(String message) {
        System.out.println(message);
    }
}
