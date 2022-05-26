package br.inatel.cdg;

public class Mercadoria {

    private int codigo;
    private String fabricante, descricao;
    private double valor;

    public Mercadoria(int codigo, String fabricante, String descricao, double valor) {
        this.codigo = codigo;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void mostraInfo(){
        System.out.println("Info das Mercadorias: ");
        System.out.println("Codigo: " + codigo);
        System.out.println("fabricante: " + fabricante);
        System.out.println("descriçao: " + descricao);
        System.out.println("valor: " + valor);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
