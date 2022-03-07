public class Funcionario {
    int idade, cpf;
    float salario;
    String nome;

    void tiraFerias (String mes) {
        System.out.println(nome + "vai tirar férias em " + mes);
    }

    float calculaSalarioAnual (){
        return salario * 12;
    }
}
