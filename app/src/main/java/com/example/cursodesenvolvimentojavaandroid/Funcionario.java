package com.example.cursodesenvolvimentojavaandroid;

class Funcionario {

    //Propriedades
    String nome;
    double salario;

    //Método com retorno
    double recuperarSalario( double bonus, double descontoAdicional){
        this.salario = this.salario - (this.salario * 0.1);
        return this.salario + bonus - descontoAdicional;
    }

    //Método sem retorno
    /*void recuperarSalario( ){
        //Pega o valor total do salário definido e subtrae por 10%
        this.salario = this.salario - (this.salario * 0.1);
        System.out.println(this.salario);
    }
    */
}
