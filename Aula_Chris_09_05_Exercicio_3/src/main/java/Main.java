import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Integer> l1 = new ArrayList<>();
        Map <Integer, Integer> m1 = new HashMap();
        Set <Integer> s1 = new HashSet<>();

        long tempoInicial;
        long tempoFinal;
        long tempoMedio;
        long tempoBuscarList;
        int i = 0;
        int Numvalores = 100000;

        tempoInicial = System.currentTimeMillis();
        for (i=0;i<Numvalores;i++){
           l1.add(i);

        }
        tempoFinal = System.currentTimeMillis();

        tempoMedio = tempoFinal - tempoInicial;
        System.out.println("Tempo de inserir list: "+ tempoMedio);

        tempoInicial = System.currentTimeMillis();
        for (i=0;i<Numvalores;i++){
            m1.put(i,i);

        }
        tempoFinal = System.currentTimeMillis();

        tempoMedio = tempoFinal - tempoInicial;
        System.out.println("Tempo de inserir Map: "+ tempoMedio);

        tempoInicial = System.currentTimeMillis();
        for (i=0;i<Numvalores;i++){
            s1.add(i);

        }
        tempoFinal = System.currentTimeMillis();

        tempoMedio = tempoFinal - tempoInicial;
        System.out.println("Tempo de inserir Set: "+ tempoMedio);


        tempoInicial = System.currentTimeMillis();
        for (i=0;i<Numvalores;i++){
            l1.contains(i);

        }
        tempoFinal = System.currentTimeMillis();
        tempoMedio = tempoFinal - tempoInicial;
        System.out.println("Tempo de Busca list: "+ tempoMedio);

        tempoInicial = System.currentTimeMillis();
        for (i=0;i<Numvalores;i++){
            m1.containsKey(i);

        }
        tempoFinal = System.currentTimeMillis();
        tempoMedio = tempoFinal - tempoInicial;
        System.out.println("Tempo de Busca map: "+ tempoMedio);

        tempoInicial = System.currentTimeMillis();
        for (i=0;i<Numvalores;i++){
            s1.contains(i);

        }
        tempoFinal = System.currentTimeMillis();
        tempoMedio = tempoFinal - tempoInicial;
        System.out.println("Tempo de Busca set: "+ tempoMedio);
    }
}
