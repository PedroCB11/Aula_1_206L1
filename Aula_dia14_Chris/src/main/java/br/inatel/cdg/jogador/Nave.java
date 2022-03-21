package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

import java.util.prefs.BackingStoreException;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast) {
        if (ast.getTipoAsteroide().equals("Grande")) {
            if (this.tipoTiro.equals("Explosivo")) {
                System.out.println(this.nome + " Destruiu o asteroide Grande!");
                ast.destruir();

            }

        }
        else if (ast.getTipoAsteroide().equals("Pequeno")){
                if (this.tipoTiro.equals("Normal")) {
                    System.out.println(this.nome + " Destruiu o asteroide Pequeno!" );
                    ast.destruir();

                } else {
                    System.out.println("Ateroide do tipo grande nao pode ser destruido por tiro normal de "+ this.nome  );

                }
            }

        }
    }


