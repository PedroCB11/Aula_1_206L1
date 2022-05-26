package br.inatel.cdg;

public class Arquiteto extends Funcionario implements GerenciaProjeto{
    private String especialidade;

    public Arquiteto(String nome, int idade, double salario, String especialidade) {// Construtor, herança
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
        this.especialidade = especialidade;
    }
    @Override
    public void MostraInfo(){
        super.MostraInfo();
        System.out.println("Especialidade em " +especialidade);
    }

    @Override
    public void ExecutaAcao(){
        //super.ExecutaAcao();
        System.out.println(" está dando o cu");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void gerenciar() {
        System.out.println(this.getNome() + " gerenciou uma ambientaçao de uma casa");
    }
}
