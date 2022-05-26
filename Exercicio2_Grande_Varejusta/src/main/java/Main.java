import br.inatel.cdg.Fogao;
import br.inatel.cdg.Geladeira;
import br.inatel.cdg.Mercadoria;
import java.util.Scanner;  // UTILIZA ESSA BIBLIOTECA PARA USAR O CIN NO JAVA

public class Main {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in); // CIN NO JAVA
      // d = sc.nextDouble();

        Mercadoria[] mercadorias = new Mercadoria[4];

        Fogao fogao1 = new Fogao(123, "fabricante1", " é linda", 1, 5, "Manual");
        Fogao fogao2 = new Fogao(456, "fabricante2", "é feia", 2, 4, "Automatico");

        Geladeira geladeira1 = new Geladeira(111, "fabricante3", "é mais ou menos", 3, 1, 5, "nao é inox");
        Geladeira geladeira2 = new Geladeira(222, "fabricante4", "da pro gasto", 4, 2, 10, " é inox");

        mercadorias[0] = fogao1;
        mercadorias[1] = fogao2;
        mercadorias[2] = geladeira1;
        mercadorias[3] = geladeira2;


        for (int i=0; i < mercadorias.length; i++) {
            if (mercadorias[i] != null) {
                if (mercadorias[i] instanceof Geladeira) {
                    Geladeira g1 = (Geladeira) mercadorias[i];
                    g1.mostraInfo();
                }else if (mercadorias[i] instanceof Fogao){
                    Fogao f1 = (Fogao) mercadorias[i];
                    f1.mostraInfo();
                }
            }

        }
    }
}
