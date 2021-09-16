package com.example.treino;

public class ControleRemoto implements Controlador{


    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Getters e Setters: ENCAPSULAMENTO
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }


    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    //construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
//sobrescrever métodos abstratos
    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado "+this.getLigado());
        System.out.println("Está tocando "+this.getTocando());
        System.out.println("Volume "+this.getVolume());
        for(int i =0; i<=this.getVolume(); i+=10) {
            System.out.print("|");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() >0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() ==0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(getLigado() && (this.getTocando())){
            this.setTocando(false);
        }
    }
}
