import br.inatel.cdg.Comojogar;
import br.inatel.cdg.Entrada;
import br.inatel.cdg.Jogador;
import br.inatel.cdg.Ranking;
import excessoes.Excesaum;
import excessoes.ExcessaoQueisso;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Ranking r = null; // criar funçao para ler BD

        Scanner sc = new Scanner(System.in);
        Entrada entrada = new Entrada();
        boolean flag = true;
        String jogarnovamente;
        Jogador jogador;
        long tempoInicial;
        long tempoFinal;
        long tempoGasto;
        int i = 0;
        int NumPassos = 100;
        Jogador jogadores[];
        int anterior;

        String peDireito = null;
        String passoanterior;
        String passoatual ;

        boolean primeiravez = true;

        while (flag) {

            if (primeiravez) {
                System.out.println("BEM VINDO");
            }
            primeiravez = false;
            System.out.println("SELECIONE A OPÇAO DESEJADA: ");
            System.out.println("1- JOGAR");
            System.out.println("2- COMO JOGAR");
            System.out.println("3- RANKING DOS MELHORES");
            System.out.println("4- SAIR");
            System.out.println("Sua opçao: ");
            //entrada da opção desejada
            int opçaodesejada =0;
            do {
                try {
                    opçaodesejada = entrada.Menu();

                }catch (Excesaum e){
                    System.out.println(e.getMessage());
                }

            }while(opçaodesejada != 1 && opçaodesejada != 2 && opçaodesejada != 3 && opçaodesejada != 4);

            switch (opçaodesejada) {
                case 1:
                    sc.nextLine();
                    int passos = 0;
                    passoanterior = "x";


                    Jogador j1 = new Jogador();
                    System.out.println("Digite seu nick: ");
                    j1.setNome(sc.nextLine());

                    System.out.println("O jogo vai começar em ");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(" 3 ");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(" 2 ");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(" 1 ");

                        // TODO CHAMA O IF DO QUEIMOU A LARGADA
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(" VAI VAI VAI! ");
                        // COMEÇA O JOGO
                        tempoInicial = System.currentTimeMillis();
                        passoatual = sc.nextLine();


                        while (passos < 10) {
                            passoatual = sc.nextLine();
                            if (!passoatual.equals(passoanterior)) {
                                passos++;
                                System.out.println("PASSOS DADOS "+ passos);

                            }
                            else if(passoatual.equals(passoanterior)){
                                System.out.println("Ops, quase tropecou"); //Substituir por "Ops, quase tropeceu" ou "perdeu o pé".
                                System.out.println("LEMBRE-SE SEMPRE DE USAR O OUTRO PÉ");
                            }
                            passoanterior = passoatual;



                        }
                        System.out.println("FIM DA CORRIDA! ESTAMOS CALCULANDO SEU TEMPO...");
                        TimeUnit.SECONDS.sleep(4);
                        tempoFinal = System.currentTimeMillis();
                        tempoGasto = tempoFinal - tempoInicial;
                        pos_jogo:
                        System.out.println("Seu tempo foi: " + tempoGasto + "ms.");
                        j1.setTempogasto(tempoGasto);
                        r.addJogador(j1);
                        System.out.println("Sua posiçao no ranking é: " + r.VerPosicao(j1));// implementaar retorno do rank

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("JOGAR NOVAMENTE? SIM//NAO ");
                    jogarnovamente = sc.nextLine();
                    if (jogarnovamente.equals("SIM") || jogarnovamente.equals("sim")) {
                        opçaodesejada = 1;
                    } else if (jogarnovamente.equals("NAO") || jogarnovamente.equals("nao")) {
                        flag = false;
                    } else if(!jogarnovamente.equals("SIM") && !jogarnovamente.equals("NAO") && !jogarnovamente.equals("sim") && !jogarnovamente.equals("nao") ){
                        System.out.println("DIGITE SIM OU NAO");
                        jogarnovamente = sc.nextLine();
                    }
                    break;
                case 2:
                    Comojogar.Comojogartexto();
                    try {
                        TimeUnit.SECONDS.sleep(22);
                        System.out.println(" PREPARADO? SE ESTIVER, DIGITE 1 PARA JOGAR ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("ranking dos melhores vai ser mostrada");
                    break;

                case 4:
                    System.out.println("TCHAU TCHAU");
                    flag = false;
                    break;
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
