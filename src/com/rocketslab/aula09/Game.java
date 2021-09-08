package com.rocketslab.aula09;

import java.util.Random;

public class Game {

    private final Player playerOne;
    private final Player playerTwo;

    public Game(Player p1, Player p2) {
        this.playerOne = p1;
        this.playerTwo = p2;
    }

    public void printPlayersStats() {
        this.playerOne.stats();
        this.playerTwo.stats();
    }

    public void play() {
        Random randomizer = new Random();
        int playerOneCoins = randomizer.nextInt(30);
        int playerTwoCoins = randomizer.nextInt(30);

        System.out.printf("O jogador 1 coletou %s moedas\n", playerOneCoins);
        System.out.printf("O jogador 2 coletou %s moedas\n", playerTwoCoins);

        for (int i=0; i < playerOneCoins; i++) {
            this.playerOne.collectCoin();
        }

        for (int i=0; i < playerTwoCoins; i++) {
            this.playerTwo.collectCoin();
        }
    }
}
