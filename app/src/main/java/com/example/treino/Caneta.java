package com.example.treino;

public class Caneta {
    //atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;


    //métodos

    //construtor
    public Caneta(String m, String c, float p) { // não tem void
        // mesmo nome da classe
        this.cor = c;
        this.setPonta(p);
        this.setModelo(m);
        this.tampar();
    }
    public String getModelo() { // aqui eu coloco o tipo do retorno ali no começo e entre parênteses o atributo
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public Float getPonta() { // aqui eu coloco o tipo do retorno ali no começo e entre parênteses o atributo
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Está tampada "+ this.tampada);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Modelo: "+ this.modelo);
    }
    public void rabiscar() {//void significa sem retorno
        if(tampada == false) {
            System.out.println("Erro! Está tampada!");
        }
        else {
            System.out.println("Rabiscando!");
        }
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }

}
