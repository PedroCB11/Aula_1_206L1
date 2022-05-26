package br.inatel.cdg;

public class Pedido {
    int id;
    String tipoMadeira;
    double precoProducao;
    double precoVenda;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoMadeira() {
        return tipoMadeira;
    }

    public void setTipoMadeira(String tipoMadeira) {
        this.tipoMadeira = tipoMadeira;
    }

    public double getPrecoProducao() {
        return precoProducao;
    }

    public void setPrecoProducao(double precoProducao) {
        this.precoProducao = precoProducao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Pedido(int id, String tipoMadeira, double precoProducao, double precoVenda) {
        this.id = id;
        this.tipoMadeira = tipoMadeira;
        this.precoProducao = precoProducao;
        this.precoVenda = precoVenda;
    }

    Pedido(int pp, int pv, String tipom){};


    public void mostraInfo(){
        System.out.println("tipo da madeira:" + tipoMadeira);
        System.out.println("preço de produçao:" + precoProducao);
        System.out.println("preço de vanda" + precoVenda);


    }

}

