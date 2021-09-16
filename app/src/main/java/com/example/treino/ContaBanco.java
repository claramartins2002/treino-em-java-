package com.example.treino;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean status;

    //getters e setters


    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }


//métodos

    //construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;

    }
    public void estadoAtual(){
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Saldo: "+this.getSaldo());
    }
    public void abrirConta(String t) {
        //this.dono = d;
        this.tipo = t;
        if (t == "CC") {
            this.saldo = 50;
        } else if (t == "CP") {
            this.saldo = 150;
        }
        this.status = true;
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, ainda tem grana");
        } else if (this.getSaldo() < 0) {
            System.out.println("Saldo negativo! erro!");
        } else {
            System.out.println("Conta desativada");
        }
    }

    public void depositar(float v) {
        if (this.status == true) {
            this.setSaldo(saldo + v);
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Erro! conta inativa");
        }
    }

    public void sacar(float v) {
        if (this.status == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(saldo - v);
                System.out.println("Saque realizado com sucesso");
            } else {
                System.out.println("Saldo insuficiente para este saque");
            }
        } else {
            System.out.println("Erro! conta inativa");
        }

    }

    public void pagarMens() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.status == true) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade de R$ " + v + " paga com sucesso ");
        } else {
            System.out.println("Mensalidade não pôde ser paga");
        }


    }
}
