package br.inatel.cdg;

public class Humano extends Personagem implements CombateCorpoACorpo,Alianca{
    private String tamanhoDoCabelo;

    public Humano(double vida, String nome, String classe, String tamanhoDoCabelo) {
        super(vida,nome,classe);
        setClasse("Paladino");
        this.tamanhoDoCabelo = tamanhoDoCabelo;
    }

    public String getTamanhoDoCabelo() {
        return tamanhoDoCabelo;
    }

    public void setTamanhoDoCabelo(String tamanhoDoCabelo) {
        this.tamanhoDoCabelo = tamanhoDoCabelo;
    }

    public String Motivar(){
        return "Vamooo!(motivacao)";
    }

    @Override
    public void ForTheAliance() {
        System.out.println("pela aliança!");
    }

    @Override
    public void InvadirHorda() {
        System.out.println("Invadindo Ogrimmar");

    }

    @Override
    public void SacarArma() {
        System.out.println("Desembaiando espada");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Classe: "+ tamanhoDoCabelo);
    }
}
