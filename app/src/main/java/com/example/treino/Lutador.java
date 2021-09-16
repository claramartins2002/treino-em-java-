package com.example.treino;

public class Lutador {
    //construtor
    public Lutador(int idade, float altura, float peso, int vitorias, int derrotas, int empates, String nome, String nacionalidade) {
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    //Atributos
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private int derrotas;
    private int empates;
    private String nome;
    private String nacionalidade;

    //encapsulamento: getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
       if(this.peso <52.2){
           this.categoria = "inválido";
       }
       else if(this.peso <=70.3){
            this.categoria = "leve";
        }
        else if(this.peso <=83.3){
            this.categoria = "médio";
        }
        else if(this.peso <120.2){
            this.categoria = "pesado";
        }
        else{
            this.categoria = "inválido";
       }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // métodos
    public void apresentar() {
        System.out.println("Chegou a hora! Apresentamos o lutador "+this.getNome()+" diretamente de "+this.getNacionalidade()+" com "+this.getIdade()+" anos e pesando "+this.getPeso()+"kg. ");
        System.out.println("Com "+this.getVitorias()+", "+this.getDerrotas()+" derrotas e "+this.getEmpates()+" empates.");
    }
    public void status() {
        System.out.println(this.getNome()+", peso "+this.getCategoria());
        System.out.println("Com "+this.getVitorias()+", "+this.getDerrotas()+" derrotas e "+this.getEmpates()+" empates.");
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() +1);
    }


}
