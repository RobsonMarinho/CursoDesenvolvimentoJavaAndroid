package com.example.cursodesenvolvimentojavaandroid;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    //construtor " tem sempre que ter o mesmo nome da classe"
    public ContaBancaria(){
        System.out.println("Configurações iniciais");
    }
    public ContaBancaria(int nConta){
        this.numeroConta = nConta;
        //System.out.println("Construtor chamado: " + nConta);
    }
}
