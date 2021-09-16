package com.example.treino;

public class Aluno extends Pessoa{
    //atributos
    private int matricula;
    private String curso;

    //getters e setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //métodos
    public void cancelarMatr() {
        System.out.println("Matrícula cancelada");
    }
}
