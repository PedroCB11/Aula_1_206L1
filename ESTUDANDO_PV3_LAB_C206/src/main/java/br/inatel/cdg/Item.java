package br.inatel.cdg;

import java.math.BigDecimal;

public class Item {
    private final int ID;
    private String descricao;
    private int quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;

    public Item(int ID) {
        this.ID = ID;
        valorUnitario = new BigDecimal("1");
        valorTotal = new BigDecimal("1");

    }

    public int getID() {
        return ID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal() {
        valorTotal = valorUnitario.multiply(new BigDecimal(quantidade)); // calcula e retorna o valor total do item
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
