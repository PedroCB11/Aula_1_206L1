import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continua = true;


        do{

            try{

                System.out.println("BEM VINDO");
                System.out.println("SELECIONE A OPÇAO DESEJADA: ");
                System.out.println("1- JOGAR");
                System.out.println("2- COMO JOGAR");
                System.out.println("3 - RANKING DOS MELHORES");

                int opçaodesejada = sc.nextInt();

                if (opçaodesejada== 1 ){
                    System.out.println("o jogo vai rolar");
                }else if (opçaodesejada == 2 ){
                    System.out.println("O Jogo se basea em uma simples maratona de 100 metros rasos, para da o primeiro passo, \r aperte" +
                            "");
                }
                continua = false;

            }
            catch (InputMismatchException ErroDeIncercaoDeDados){
                System.out.println("Nao é permitido andar com o mesmo pé duas vezes, QUASE CAIU");
                sc.nextLine();
            }finally {
                System.out.println("Seu tempo foi: ");
                System.out.println("Sua posiçao no ranking é: " );
            }
        }while (continua);


    }
}
