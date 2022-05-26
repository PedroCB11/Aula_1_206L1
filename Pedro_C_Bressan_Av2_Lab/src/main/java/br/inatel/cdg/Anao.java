package br.inatel.cdg;

public class Anao extends Personagem implements Alianca, CombateDistancia{
    private String tamanhoDaBarba;

    public Anao(double vida, String nome, String classe, String tamanhoDaBarba) {
        super(vida, nome, classe);
        setClasse("Caçador");
        this.tamanhoDaBarba = tamanhoDaBarba;
    }

    public String getTamanhoDaBarba() {
        return tamanhoDaBarba;
    }

    public void setTamanhoDaBarba(String tamanhoDaBarba) {
        this.tamanhoDaBarba = tamanhoDaBarba;
    }

    public String Endurecer(){
        return "Anao vai Endurecer!";
    }

    @Override
    public void ForTheAliance() {
        System.out.println("PELA ALIANÇA");
    }

    @Override
    public void InvadirHorda() {
        System.out.println("Invadindo Orgrimmar");
    }

    @Override
    public void CastarSpell() {
        System.out.println("castando um totem");
    }
}
