package br.inatel.cdg;

public class Geladeira extends Mercadoria{

    private int quantidaPortas;
    private int tamanho;

    public Geladeira(int codigo, String fabricante, String descricao, double valor, int quantidaPortas, int tamanho, String tipo) {
        super(codigo, fabricante, descricao, valor);
        this.quantidaPortas = quantidaPortas;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Quantidade de portas: " + quantidaPortas);
        System.out.println("tamanho: "+ tamanho);
    }



    public int getQuantidaPortas() {
        return quantidaPortas;
    }

    public void setQuantidaPortas(int quantidaPortas) {
        this.quantidaPortas = quantidaPortas;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String tipo;
}
