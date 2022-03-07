public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;


    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("Carro" + nome + "TA PULANU");
    }

    void soltaTurbo(){
        System.out.println("Carro" + nome + "ta soltando N0S IHUUUUUUUUUUULLLLLLL");
    }

    void fazerDrift (){

        System.out.println("Carro"+ nome +  "ta fazendo Drift rangangangangangangangangangangangangan");
    }
}
