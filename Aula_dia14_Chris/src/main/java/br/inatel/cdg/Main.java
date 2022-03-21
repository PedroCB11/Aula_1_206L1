package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {


    public static void main(String[] args){
        Asteroide asteroide1 = new Asteroide("asteroide1","Pequeno");
        Asteroide asteroide2 = new Asteroide("asteroide2","Grande"); // destruido por tiro explosivo

        Nave n1 =new Nave("nave1", 100.0,"Normal"); //só destroi asteroide pequeno
        Nave n2 =new Nave("nave2", 100.0,"Explosivo"); //destroi astoride grande


        n1.atirar(asteroide1);//Destruir asteroide
        n1.atirar(asteroide2); // Nao destruir

        n2.atirar(asteroide1); // destruir
        n2.atirar(asteroide2);// destruir

    }
}
