package br.inatel.cdg;

public class Jogador {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRanking() {
        return Ranking;
    }

    public void setRanking(int ranking) {
        Ranking = ranking;
    }

    public int getTempogasto() {
        return tempogasto;
    }

    public void setTempogasto(int tempogasto) {
        this.tempogasto = tempogasto;
    }

    int Ranking;
    int tempogasto;


    public void PosNoRanking(){

    }

}
