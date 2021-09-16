package com.example.treino;

public class Ave extends Animal {

    @Override
    public void locomover() {
        System.out.println("com asas");
    }

    @Override
    public void alimentar() {
        System.out.println("comer insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("prupru");
    }
}
