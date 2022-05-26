package br.inatel.cdg;

public class Troll extends Personagem implements Horda,CombateDistancia{
    private String tamanhoDaPresa;

    public Troll(double vida, String nome, String classe, String tamanhoDaPresa) {
        super(vida, nome, classe);
        this.tamanhoDaPresa = tamanhoDaPresa;
    }

    public String getTamanhoDaPresa() {
        return tamanhoDaPresa;
    }

    public void setTamanhoDaPresa(String tamanhoDaPresa) {
        this.tamanhoDaPresa = tamanhoDaPresa;
    }

    public String Regenerar(){
        return "Glup glup (regenerando com poçao,troll)";
    }

    @Override
    public void CastarSpell() {
        System.out.println("Atirando");
    }

    @Override
    public void ForTheHorde() {
        System.out.println("Pela horda!");
    }

    @Override
    public void InvadirAliança() {
        System.out.println("invadindo Stormwind");

    }
}
