package com.example.treino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public static void main(String[] args) {
        /*Caneta c1 = new Caneta("Bic", "rosa", 0.7f);
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        c1.status();
        Caneta c2 = new Caneta("Stambillo", "preta", 0.2f);
        c2.status();*/
        /*ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(111);
        pessoa1.setDono("Clara Martins");
        pessoa1.abrirConta("CC");
        pessoa1.depositar(600);
        pessoa1.sacar(650);
        pessoa1.estadoAtual();
        pessoa1.fecharConta();
        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(222);
        pessoa2.setDono("João Lucas Martins");
        pessoa2.abrirConta("CP");
        pessoa2.estadoAtual();*/

        /*ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.maisVolume();
        c1.maisVolume();
        c1.abrirMenu();*/

        /*Lutador l1[] = new Lutador[3];
        l1[0] = new Lutador (27, 1.80f, 90f, 4, 5, 3, "Pretty Boy", "brasil");
        l1[1] = new Lutador(33, 1.60f, 60f, 3,4,5,"William", "quenia");
        l1[2] = new Lutador(37, 1.98f, 110f, 3,4,5,"Zé", "frança");
        l1[2].status();
        l1[0].apresentar();*/

        /*Aluno a1 = new Aluno();
        a1.setNome("Clara");
        a1.setIdade(18);
        a1.setCurso("Informática");
        a1.setSexo("mulher");*/

        Mamifero cao = new Mamifero();
        cao.alimentar();
        Ave pomba = new Ave();
        pomba.alimentar();
    }

}