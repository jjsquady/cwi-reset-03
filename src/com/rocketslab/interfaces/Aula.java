package com.rocketslab.interfaces;

public abstract class Aula {
    public abstract void run();

    public final void println(String message) {
        System.out.println(message);
    }
}
