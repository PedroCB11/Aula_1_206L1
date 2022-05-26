public class Principal {
    public static void main(String[] args) {

        Nave n1 = new Nave("Nave1", 100);
        Nave n2 = new Nave("Nave2", 200);
        if(n1 != n2)
            n1.setVida(50);
        else
            n2.setVida(70);
        n2 = n1;

        System.out.println(n2.getVida() + " " + n1.getVida());


    }
}
