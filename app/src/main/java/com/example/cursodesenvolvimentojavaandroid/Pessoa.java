package com.example.cursodesenvolvimentojavaandroid;

public class Pessoa {

    private String nome;
    private int idade;
    //Sobre carga de método exibirDados baseando-se nos parâmetros
    public void exibirDados(String nome){
        System.out.println("Exibir apenas nome: " + nome);
    }
    public void exibirDados(String nome, int idade) {
        System.out.println("nome: " + nome + " idade: " + idade);
    }
}
