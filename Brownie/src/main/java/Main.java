import javax.sound.sampled.LineUnavailableException;
import java.util.NavigableMap;

public class Main {
    public static void main(String[] args) {
        Nave [] naves = new Nave[5];

        Nave n1 =  new Nave("Nave1",100);
        Nave n2 =  new Nave("Nave2",150);
        Nave n3 =  new Nave("Nave3",130);


        n2 = n3;
        System.out.println(n1.getNome());
        System.out.println(n2.getNome());
        System.out.println(n3.getNome());


    }
}
