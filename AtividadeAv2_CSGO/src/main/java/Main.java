import Jogo.CSGO;
import Skins.Atheris;
import Skins.Cortex;
import Skins.Moonrise;
import Skins.Nightmare;



import java.util.*;


public class Main {
    public static void main(String[] args) {

        //Lista de trouxas que vao comprar skins de csgo
        List<String> listanomes = new ArrayList<String>();
        listanomes.add("Pedro Consoli Bressan");
        listanomes.add("trouxa 2 ");
        listanomes.add("trouxa 3 ");
        listanomes.add("trouxa 4");
        listanomes.add("trouxa 5");
        listanomes.add("trouxa 6");



        //Criando a Lista e instanciando os objetos
        List<CSGO> csgo = new ArrayList<CSGO>();
        CSGO awp = new Atheris(listanomes.get(0), new Random().nextDouble()*100);
        CSGO glock = new Moonrise(listanomes.get(1),new Random().nextDouble()*100);
        CSGO m4a1s = new Nightmare(listanomes.get(2),new Random().nextDouble()*100);
        CSGO ump = new Moonrise(listanomes.get(3),new Random().nextDouble()*100);
        CSGO usps = new Cortex(listanomes.get(4),new Random().nextDouble()*100);
        CSGO scout = new Cortex(listanomes.get(5),new Random().nextDouble()*100);

        //Adicionando os objetos na lista
        csgo.add(awp);
        csgo.add(glock);
        csgo.add(m4a1s);
        csgo.add(ump);
        csgo.add(usps);
        csgo.add(scout);


        //Demonstrando os objetos criados
        for(CSGO csgo1: csgo){
            System.out.println(csgo1.getPlayers() + " : " + csgo1.getPrecos());
        }
        Collections.sort(csgo);

        for(CSGO csgo1: csgo){
            System.out.println(csgo1.getPlayers() + " : " + csgo1.getPrecos());
        }
    }
}


