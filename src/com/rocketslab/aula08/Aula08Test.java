package com.rocketslab.aula08;

import com.rocketslab.interfaces.Aula;

public class Aula08Test extends Aula {
    @Override
    public void run() {
        Player mario = new Player("Mario", 40, 1.52);
        Player luigi = new Player("Luigi", 38, 1.80);

        Game game = new Game(mario, luigi);

        println("-------- SUPER MARIO GAME ---------");
        game.printPlayersStats();
        println("----------- GAME START ------------");
        game.play();

        println("----- GAME END ----");
        game.printPlayersStats();
    }
}
