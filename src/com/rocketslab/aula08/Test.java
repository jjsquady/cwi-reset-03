package com.rocketslab.aula08;

import com.rocketslab.interfaces.TestContract;

public class Test extends TestContract {
    public static void main(String[] args) {

        Player mario = new Player("Mario", 40, 1.52);
        Player luigi = new Player("Luigi", 38, 1.80);

        Game game = new Game(mario, luigi);

        log("-------- SUPER MARIO GAME ---------");
        game.printPlayersStats();
        log("----------- GAME START ------------");
        game.play();

        log("----- GAME END ----");
        game.printPlayersStats();

    }
}
