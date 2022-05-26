package br.inatel.cdg;

public class Orc extends Personagem implements Horda,CombateCorpoACorpo {
    private String corDaPele;

    public Orc(double vida, String nome, String classe, String corDaPele) {
        super(vida, nome, classe);
        setClasse("Guerreiro");
        this.corDaPele = corDaPele;
    }

    public String getCorDaPele() {
        return corDaPele;
    }


    public void setCorDaPele(String corDaPele) {
        this.corDaPele = corDaPele;
    }

    public String Enfurecer(){
       return "Aaaarrgh!( ORC ficando bravo)";
    }

    @Override
    public void SacarArma() {
        System.out.println("Pegando um machado de duas maos");
    }

    @Override
    public void ForTheHorde() {
        System.out.println("PELA HORDA!!");
    }

    @Override
    public void InvadirAliança() {
        System.out.println("Invadindo Stormwind");

    }

}
