public class Principal {


    public static void main(String[] args) {


        Conta c1 = new Conta();
        c1.saldo = 58;

        Conta c2 = new Conta ();
        c2.saldo =  100;

        System.out.println( "Saldo C1: " + c1.saldo);
        System.out.println( "Saldo C2: " + c2.saldo);

        System.out.println("Fazendo a transferencia!");
        c2.transferencia(quantia: 20,c1);
        System.out.println("Saldo C1: " + c1.saldo);
        System.out.println("Saldo C2: " + c2.saldo);


        }
    }

}
