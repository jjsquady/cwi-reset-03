package com.rocketslab.aula06;

import com.rocketslab.interfaces.TestContract;

public class Test extends TestContract {
    public static void main(String[] args) {
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
        marioDie.characteristics();
        marioDie.die();
        marioDie.characteristics();

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
}
