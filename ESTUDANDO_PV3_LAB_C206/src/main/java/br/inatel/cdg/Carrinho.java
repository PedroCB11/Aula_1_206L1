package br.inatel.cdg;

import java.math.BigDecimal;

public interface Carrinho {
    public abstract void adicionarItem (Item it);
    public abstract void listarItens();
    public abstract BigDecimal calcularValorTotal();


}
