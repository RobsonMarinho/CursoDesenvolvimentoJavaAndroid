package com.example.cursodesenvolvimentojavaandroid;

class Passaro extends Animal{

        void voar(){
            System.out.println("Voar como um passaro");
        }
        void correr(){
            super.correr();
            System.out.println("Passaro");
        }
}
