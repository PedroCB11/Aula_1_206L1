//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class mainborem{
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//
//        while(flag){
//
//            System.out.println("1 - Add novo Carrinho");
//            System.out.println("2 - Mostrar Carrinhos");
//            System.out.println("3 - Ordenar carrinhos em ordem crescente de velocidade");
//            System.out.println("4 - Ordenar carrinhos em ordem decrescente de velocidade");
//            System.out.println("5 - Sair");
//            System.out.println("Sua opção: ");
//            int op = sc.nextInt();
//
//            switch (op){
//                case 1:
//                    sc.nextLine();
//                    String n;
//                    int v;
//                    String ch;
//                    System.out.println("Digite o nome: ");
//                    n = sc.nextLine();
//                    System.out.println("Digite a velocidade: ");
//                    v = sc.nextInt();
//                    sc.nextLine();
//                    System.out.println("Digite o chassi: ");
//                    ch = sc.nextLine();
//                    try{
//                        boolean flag1 = true;
//                        if(v <= 0)
//                            throw new InfoInvalidaException(v,ch);
//                        if (ch.equalsIgnoreCase("Breakout")) {
//                            flag1 = false;
//                        } else if (ch.equalsIgnoreCase("Merc")) {
//                            flag1 = false;
//                        } else if (ch.equalsIgnoreCase("Octane")) {
//                            flag1 = false;
//                        }
//                        if (flag1){
//                            throw new InfoInvalidaException(v,ch);
//                        }
//                        if(v >= 0 && !flag1){
//                            Carrinho c = new Carrinho(n,v,ch);
//                            Arquivo.escrever(c,true);
//                        }
//                    }catch (InfoInvalidaException e){
//                        System.out.println(e);
//                    }
//                    break;
//
//                case 2:
//                    ArrayList<Carrinho> carrinhos = Arquivo.ler();
//                    for (Carrinho carrinho: carrinhos) {
//                        carrinho.mostraInfo();
//                    }
//                    break;
//                case 3:
//                    ArrayList<Carrinho> cars = Arquivo.ler();
//                    Collections.sort(cars);
//                    Arquivo.escrever(cars.get(0),false);
//                    for (int i = 1; i < cars.size(); i++) {
//                        Arquivo.escrever(cars.get(i),true);
//                    }
//                    break;
//                case 4:
//                    ArrayList<Carrinho> cars2 = Arquivo.ler();
//                    Collections.sort(cars2,Collections.reverseOrder());
//                    Arquivo.escrever(cars2.get(0),false);
//                    for (int i = 1; i < cars2.size(); i++) {
//                        Arquivo.escrever(cars2.get(i),true);
//                    }
//                    break;
//                case 5:
//                    System.out.println("Você Saiu!");
//                    flag = false;
//                    break;
//                default:
//                    System.out.println("Opção Inválida");
//                    break;
//            }
//
//        }
//
//    }
//}
