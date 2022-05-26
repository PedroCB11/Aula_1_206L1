package br.inatel.cdg;

public class Professor extends Funcionario{
    private String materia;

    public Professor(String nome, int idade, double salario,String materia) {// QUANDO O CONSTRUTOR É CRIADO, É NECESSARIO COLOCAR AS INFORMAÇOES DO "PROFESSOR" DENTRO DO Professor professor = new Professor(aqui);
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
        this.materia = materia;
    }

    @Override
    public void MostraInfo(){
        super.MostraInfo();
        System.out.println("Materia: " +materia);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }



    @Override
    public void ExecutaAcao(){
        System.out.println(this.getNome() + " Esta dando aula");


    }
}
