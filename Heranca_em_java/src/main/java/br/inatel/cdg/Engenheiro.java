package br.inatel.cdg;

public class Engenheiro extends Funcionario implements GerenciaProjeto{
    private String ramo;

    public Engenheiro(String nome, int idade, double salario,String ramo) { // Construtor, herança
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
        this.ramo = ramo;
    }
    public void ExibeSalarioAnual(){ // uma funçao especifica do engenheiro
        System.out.println("Salario Anual do Eng.: " + 2000000000);
    }


    @Override
   public void MostraInfo(){
        super.MostraInfo();
        System.out.println("Ramo: "+ ramo);

    }
    @Override
    public double SalarioBonus(){
        return super.SalarioBonus() +777;

    }
    @Override
    public void ExecutaAcao(){
        System.out.println(this.getNome()+ " Está programando");
    }


    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    @Override
    public void gerenciar() {
        System.out.println(this.getNome() + " gerenciou um projeto");
    }
}
