package br.inatel.cdg;

public class Fogao extends Mercadoria{

    private int quantidadeBocas;
    private String tipoAcendimento;

    public Fogao(int codigo, String fabricante, String descricao, double valor, int quantidadeBocas, String tipoAcendimento) {
        super(codigo, fabricante, descricao, valor);
        this.quantidadeBocas = quantidadeBocas;
        this.tipoAcendimento = tipoAcendimento;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Quantidade de bocas: "+ quantidadeBocas);
        System.out.println("Tipo do acendimento: "+ tipoAcendimento);
    }

    public int getQuantidadeBocas() {
        return quantidadeBocas;
    }

    public void setQuantidadeBocas(int quantidadeBocas) {
        this.quantidadeBocas = quantidadeBocas;
    }

    public String getTipoAcendimento() {
        return tipoAcendimento;
    }

    public void setTipoAcendimento(String tipoAcendimento) {
        this.tipoAcendimento = tipoAcendimento;
    }



}
