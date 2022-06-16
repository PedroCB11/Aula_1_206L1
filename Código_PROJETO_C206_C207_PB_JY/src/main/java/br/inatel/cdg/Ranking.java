package br.inatel.cdg;

import java.util.ArrayList;
import java.util.List;

public class Ranking{
    private List<Jogador> rank;

    public Ranking(){
        rank = new ArrayList<>();
    }

    public void addJogador(Jogador j){
        rank.add(j); //TODO --ORDENAR ARRAY
    }

    public int VerPosicao(Jogador j1){
        return rank.indexOf(j1) + 1;
    }
}

