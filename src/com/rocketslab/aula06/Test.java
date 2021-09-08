package com.rocketslab.aula06;

import com.rocketslab.interfaces.TestContract;

public class Test extends TestContract {
    public static void main(String[] args) {
        Mario marioA = new Mario();

        log("\n-------- SUPER MARIO BROS (AULA 06)-----------");
        log("---- Mario start!");
        marioA.characteristics();

        log("");
        log("---- Testa Mario revigorando stamina");
        marioA.loseStamina();
        marioA.loseStamina();
        marioA.characteristics();
        marioA.refresh();
        marioA.characteristics();

        log("");
        log("---- Testa Mario morreu");
        Mario marioDie = new Mario();
        marioDie.characteristics();
        marioDie.die();
        marioDie.characteristics();

        log("");
        log("---- Testa Mario coletando moedas e ganhando uma vida");
        Mario marioCoin = new Mario();
        marioCoin.characteristics();
        // ***************************************************************************************
        // Monta um laço de repetição de 0 até 9 para fazer Mario ganhar 10 moedas e uma vida
        // ***************************************************************************************
        for (int i=0; i < 10; i++) {
            marioCoin.collectCoin();
        }
        marioCoin.characteristics();
        log("\n---- Testa Mario perde as vidas que ganhou");
        marioCoin.die();
        marioCoin.characteristics();
        marioCoin.die();
        marioCoin.characteristics();
        marioCoin.die();
        log("\n---- Mario mais uma vida zerando vidas e stamina");
        marioCoin.characteristics();
    }
}
