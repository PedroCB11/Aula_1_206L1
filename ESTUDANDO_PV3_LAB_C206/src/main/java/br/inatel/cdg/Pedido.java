package br.inatel.cdg;

import java.math.BigDecimal;

public class Pedido implements Carrinho{
    private int id;
    private Item[] itens;
    private final int MAXIMO_ITENS;
    private int qtditens;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public int getMAXIMO_ITENS() {
        return MAXIMO_ITENS;
    }

    public int getQtditens() {
        return qtditens;
    }

    public void setQtditens(int qtditens) {
        this.qtditens = qtditens;
    }

    public Pedido(int ID) {
        MAXIMO_ITENS = 3;
        qtditens = 0;
        itens = new Item[MAXIMO_ITENS];
    }

    @Override
    public void adicionarItem(Item it) throws ArrayIndexOutOfBoundsException { // quando seu metodo nao souber oq fazer com a exceçao ele deve passar par aquem tem esse controle.. use "throws"
        itens [getQtditens()] = it;
        qtditens ++;
    }

    @Override
    public BigDecimal calcularValorTotal() {
        BigDecimal total = new BigDecimal("0");
        for(Item it : itens){
            if (it != null){
                total = total.add (it.getValorTotal());
            }
        }
        return total;
    }
    @Override
    public void listarItens(){
        for (Item it : itens) {
            if (it  != null){
                System.out.println("ID: " + it.getID());
                System.out.println("Descriçao: " + it.getDescricao());
                System.out.println("Quantidade: " + it.getQuantidade());
                System.out.println("Valor unitario: " + it.getValorUnitario());
                System.out.println("Valor total do item: " + it.getValorTotal());
            }

        }
        System.out.println("Valor total do pedido: " + calcularValorTotal());
    }
}
