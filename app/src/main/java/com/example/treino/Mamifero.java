package com.example.treino;

public class Mamifero extends Animal {
    @Override
    public void locomover() {
        System.out.println("com patas");
    }

    @Override
    public void alimentar() {
        System.out.println("comer vegetais/carne");
    }

    @Override
    public void emitirSom() {
        System.out.println("auau, miau");
    }
}
