package com.example.treino;

public abstract class Animal {
    //atributos
    private float peso;
    private int idade;
    private int membros;

    //metodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
