package com.example.cursodesenvolvimentojavaandroid.classes;

/*Modificadores de acesso
1) Public -> Todas as classes terão acesso
2) private -> Apenas pode ser acessado de dentro da classe
3) protect -> Pode ser acessado estando dentro do mesmo pacote e/ou subclasses
4) default -> Caso não tenha sido definido nenhum modificador, permitindo o acesso dentro do pacote.

 */

//Classe que vai gerenciar as contas, para que seja possível fazer depósito, saque, gerenciar o saldo do app
class Conta {
    private int numeroConta;
    private double saldo = 100;

    public double recuperarSaldo(){

        return this.saldo;
    }
    public void depositar(double valorDepositado){

        this.saldo = this.saldo+ valorDepositado;
    }
    public void sacar(double valorSaque){

        this.saldo = this.saldo - valorSaque;
    }

}
