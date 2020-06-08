package com.example.cursodesenvolvimentojavaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Passaro passaro = new Passaro();
        passaro.correr();

       Cao cao = new Cao();
       cao.correr();
       // cao.setCor("Azul");
       // System.out.println( cao.getCor() );
        /*
        Animal animal = new Animal();
        animal.correr();
        */

        /*
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Robson";
        funcionario.salario = 3000;

        double salarioRecuperado = funcionario.recuperarSalario( 150, 20);
        System.out.println("O salário do Robson é: USD " + (salarioRecuperado + 100));
        }
        //int numero = 10;
        /*Casa minhaCasa = new Casa();
        minhaCasa.cor = "Azul";

        System.out.println( minhaCasa.cor);
        minhaCasa.abrirPorta();
    */
    }
}