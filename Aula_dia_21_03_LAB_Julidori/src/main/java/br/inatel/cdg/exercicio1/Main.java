package br.inatel.cdg.exercicio1;

import br.inatel.cdg.exercicio1.calculadora.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrar com o raio: ");
        double raio = sc.nextDouble();


        System.out.println("Quantidade de vezes usada: "+ Calculadora.getQtdUsada());

        System.out.println("circunferencia: "+ Calculadora.circunferencia(raio));
        System.out.println("volume: "+ Calculadora.volume(raio));

        System.out.println("Quantidade de vezes usada: "+ Calculadora.getQtdUsada());

        Calculadora.setPI(3.14);
        System.out.println("circunferencia: "+ Calculadora.circunferencia(raio));
        System.out.println("volume: "+ Calculadora.volume(raio));3
    }
}
