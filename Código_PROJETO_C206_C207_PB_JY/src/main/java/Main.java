import br.inatel.cdg.Jogador;


import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String jogarnovamente;
        Jogador jogador;
        long tempoInicial;
        long tempoFinal;
        long tempoGasto;
        List<Integer> rank = new ArrayList<>();
        int i= 0;
        int NumPassos = 100;
        Jogador jogadores[];

        boolean primeiravez = true;

        while (flag){

            if(primeiravez)
                System.out.println("BEM VINDO");
            primeiravez = false;
            System.out.println("SELECIONE A OPÇAO DESEJADA: ");
            System.out.println("1- JOGAR");
            System.out.println("2- COMO JOGAR");
            System.out.println("3- RANKING DOS MELHORES");
            System.out.println("4- SAIR");
            System.out.println("Sua opçao: ");
            int opçaodesejada = sc.nextInt();

            switch (opçaodesejada){
                case 1:
                    sc.nextLine();

                    String n;
                    System.out.println("Digite seu nick: ");
                    n = sc.nextLine();

                    System.out.println("O jogo vai começar em ");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(" 3 ");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(" 2 ");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(" 1 ");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(" VAI VAI VAI! ");

                        tempoInicial = System.currentTimeMillis();
                        for (i=0;i<NumPassos;i++){
                            rank.add(i);

                        }
                        tempoFinal = System.currentTimeMillis();
                        tempoGasto = tempoFinal - tempoInicial;
                        System.out.println("Seu tempo foi: " + tempoGasto);
                        System.out.println("Sua posiçao no ranking é: "  );

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        System.out.println("JOGAR NOVAMENTE? SIM//NAO ");
                    jogarnovamente = sc.nextLine();
                    for(int j=0;j<0;j++){
                        if(jogarnovamente == "SIM" || jogarnovamente == "sim"){
                            opçaodesejada = 1;
                        }else if(jogarnovamente == "NAO" || jogarnovamente == "nao"){
                            flag = false;
                        }else {
                            throw new IllegalArgumentException("DIGITE SIM OU NAO");
                        }
                    }


                    break;

                case 2:

                    System.out.println("O Jogo se basea em uma simples maratona de 100 metros rasos, para dar o primeiro passo, aperte *D* ou *A*,");
                    System.out.println("D para dar o primeiro passo com o pé direiro e A para dar o primeiro passo com o pé esquerdo, o seu objetivo é completar os 100 metros no menor tempo possivel, ");
                    System.out.println("lembre-se sempre de ir com um pé de cada vez para nao tropeçar.");
                    System.out.println("BOA SORTE!");

                    try {
                        TimeUnit.SECONDS.sleep(5);
                        System.out.println(" PREPARADO? SE ESTIVER, DIGITE 1 PARA JOGAR ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.println("ranking dos melhores vai ser mostrada");
            }
        }
    }
}

//        do{
//
//            try{
//
//
//
//                int opçaodesejada = 0;
//
//
//                if (opçaodesejada== 1 ){
//                    jogador  = new Jogador();
//                    System.out.println("o jogo vai rolar");
//                }else if (opçaodesejada == 2 ){
//                    System.out.println("O Jogo se basea em uma simples maratona de 100 metros rasos, para dar o primeiro passo, aperte *D* ou *A*,");
//                    System.out.println(" D para dar o primeiro passo com o pé direiro e A para dar o primeiro passo com o pé esquerdo, o seu objetivo é completar os 100 metros no menor tempo possivel, ");
//                    System.out.println("lembre-se sempre de ir com um pé de cada vez para nao tropeçar.");
//                    System.out.println("BOA SORTE!");
//                }else if (opçaodesejada ==  3){
//                    System.out.println("TOP 5 MELHORES TEMPOS: " );
//
//                }
//                flag = false;
//
//            }
//            catch (InputMismatchException ErroDeIncercaoDeDados){
//                System.out.println("Nao é permitido andar com o mesmo pé duas vezes, QUASE CAIU");
//               // sc.nextLine();
//            }finally {
//                System.out.println("Seu tempo foi: " );
//                System.out.println("Sua posiçao no ranking é: "  );
//                System.out.println("");
//            }
//        }while (flag);
//
//
//    }
//}
