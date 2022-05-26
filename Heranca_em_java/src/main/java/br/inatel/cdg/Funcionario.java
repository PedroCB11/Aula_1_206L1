package br.inatel.cdg;

public abstract class Funcionario { // é utilizado a classe "abstract" para que nao seja possivel a criaçao de nenhum objato Funcionario, entao "Funcionario funcionario1 = new Funcionario();"" nao iria funcionar;
    private String nome;
    private int idade;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void MostraInfo() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("salario: " + salario);

    }
    public abstract void ExecutaAcao();//{ // TORNANDO ESSE METODO EM ABSTRACT, DEVEMOS RETIRAR TODOS OS SUPER.EXECUTAACAO DAS CLASSES FILHAS
       // System.out.println("está fazendo alguma coisa ");
    //}
    public double SalarioBonus(){
        return salario;

    }
}

