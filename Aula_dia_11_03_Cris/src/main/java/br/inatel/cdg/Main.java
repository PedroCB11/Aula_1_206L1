package br.inatel.cdg;

import br.inatel.cdg.matematica.Calculo;
import br.inatel.cdg.matematica.Matematica;

public class Main {
    public static void main(String[] args) {
        //Usando o fully qualified name (br.inatel.cdg.matematica) que é o nome dos pacotes
        //br.inatel.cdg.matematica.Matematica = new br.inatel.cdg.matematica.Matematica();

        Matematica matematica1 = new Matematica();

        br.inatel.cdg.outramatematica.Matematica matematica2 = new br.inatel.cdg.outramatematica.Matematica();

        Calculo calculo = new Calculo();

    }
}
