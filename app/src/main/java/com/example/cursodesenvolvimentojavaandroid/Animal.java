package com.example.cursodesenvolvimentojavaandroid;

class Animal {

    int tamanho;
    String cor;
    double peso;



    //Getter e Setter
    void setCor(String cor){
        //formatação ou validação
        this.cor = cor;
    }

    String getCor() {
        return this.cor;
    }


    void dormir(){
        System.out.println("Dormir como um animal");
    }
    void correr(){
        System.out.println("Correr como um ");
    }



}
