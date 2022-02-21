import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String E = "000 010 100 111";
        String OU = "000 011 101 111";
        String variavel;

        System.out.println("qual voce deseja? E ou OU?");
        Scanner sc = new Scanner(System.in);
        variavel = sc.next();


        if(variavel.equals("E")){
            System.out.println(E);
        }
        else {
            System.out.println(OU);
        }
    }


}

