import br.inatel.cdg.Item;
import br.inatel.cdg.Pedido;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int op;
        Scanner teclado = new Scanner(System.in);
        Pedido po = null;
        Item it;
        Random geradorID = new Random();

        do {
            System.out.println("----------------------------------------");
            System.out.println("SISTEMA DE COMPRAS DA EMPRESA ABCD S.A.");
            System.out.println("Digite a operação desejada");
            System.out.println("1- Para cadastrar um novo Item no pedido");
            System.out.println("2- Para visualizar todos os itens do pedido");
            System.out.println("9- Para sair");
            op = teclado.nextInt();
            System.out.println("----------------------------------------");
            switch (op) {
                case 1:
                    if (po == null)
                        po = new Pedido(geradorID.nextInt());
                    System.out.println("Entre com a identificação do item");
                    it = new Item(teclado.nextInt());
                    teclado.nextLine();
                    System.out.println("Entre com a descriçao do item");
                    it.setDescricao(teclado.nextLine());
                    System.out.println("Entre com a quantidade desse item");
                    it.setQuantidade(teclado.nextInt());
                    System.out.println("Entre com o valor unitario deste item");
                    teclado.nextLine();
                    it.setValorTotal(new BigDecimal(teclado.nextLine()));
                    try{                                                        // usar try para possiveis erros
                        po.adicionarItem(it);
                    }catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Podemos cadastrar somente 3 itens!");
                    }
                   // finally {
                        //statements to execute every time this try block executes
                    //}
                    break;

                case 2:
                    if (po != null) {
                        po.listarItens();
                    } else {
                        System.out.println("Pedido nao criado");
                    }
                    break;

                case 9:
                    System.out.println("Obrigado por usar nosso sistema!");
                    break;
                default:
                    System.out.println("Opçao invalida!");
            }

        }while (op != 9);
    }
}

