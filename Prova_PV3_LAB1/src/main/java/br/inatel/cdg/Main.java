package br.inatel.cdg;

import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.println("----------------------------------------------------------------");
            System.out.println("1 - Add novo Pedido");
            System.out.println("2 - Mostrar Pedidos");
            System.out.println("3 - Ordenar pedidos em ordem crescente de preço de venda");
            System.out.println("4 - Ordenar pedidos em ordem decrescente de preço de venda");
            System.out.println("5 - Sair");
            System.out.println("----------------------------------------------------------------");
            int op = sc.nextInt();

            switch (op){
                case 1:
                    sc.nextLine();
                    String tipom = null;
                    int pp;
                    int pv = 0;
                    System.out.println("Digite o tipo da madeira: ");
                    tipom = sc.nextLine();
                    System.out.println("Digite a preço de produçao: ");
                    pp = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o preço de venda: ");
                    pv = (sc.nextLine());
                    try{
                        boolean flag1 = true;

                        if(pp <= 0)
                            throw new PrejuizoException(pp,pv);

                        if(p >= 0 && !flag1){
                                Pedido p = new Pedido(pp,pv,tipom);
                            Arquivo.escrever(p,true);
                        }
                    }catch (PrejuizoException e){
                        System.out.println(e);
                    }
                    break;

                case 2:
                    ArrayList<Pedido> pedidos = Arquivo.ler();
                    for (Pedido carrinho: pedidos) {
                        carrinho.mostraInfo();
                    }
                    break;
                case 3:
                    ArrayList<Pedido> pedidos1 = Arquivo.ler();
                    Collections.sort(pedidos1);
                    Arquivo.escrever(pedidos1.get(0),false);
                    for (int i = 1; i < pedidos1.size(); i++) {
                        Arquivo.escrever(pedidos1.get(i),true);
                    }
                    break;
                case 4:
                    ArrayList<Pedido> pedidos2 = Arquivo.ler();
                    Collections.sort(pedidos2,Collections.reverseOrder());
                    Arquivo.escrever(pedidos2.get(0),false);
                    for (int i = 1; i < pedidos2.size(); i++) {
                        Arquivo.escrever(pedidos2.get(i),true);
                    }
                    break;
                case 5:
                    System.out.println("Você Saiu!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }

    }
}
