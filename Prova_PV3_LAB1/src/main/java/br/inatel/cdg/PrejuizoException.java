package br.inatel.cdg;

public class PrejuizoException extends Exception{
    public PrejuizoException(int precoVenda, int precoProducao){
        boolean flag = true;

        if(precoProducao <= precoVenda ){
            System.out.println("Voce nao pode vender um item mais barato doque esta produzindo! Insira o preço maior que: " + precoProducao  );
        } else if (precoVenda < precoProducao) {
            flag = false;

        }

    }

}
