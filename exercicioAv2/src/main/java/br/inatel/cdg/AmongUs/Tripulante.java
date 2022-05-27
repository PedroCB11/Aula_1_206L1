package br.inatel.cdg.AmongUs;

public class Tripulante extends Astronauta implements Missao {
    private int qntMissoes = 8;

    public Tripulante(String cor, String nome) {
        super(cor, nome);
    }

    @Override
    public void reportar() {
        System.out.println(this.getNome() + " reportou um corpo");
    }

    @Override
    public void reparar() {
        System.out.println(this.getNome() + " fez um reparo");

    }

    @Override
    public void fazerMissao() {
        System.out.println(this.getNome() + " fez uma missão");
        qntMissoes--;

    }
}
