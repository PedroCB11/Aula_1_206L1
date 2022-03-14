import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Empresa empresa = new Empresa();
        Scanner sc = new Scanner(System.in);


        Empresa e1 =  new Empresa();
        e1.nome = "Aperture Cience";
        e1.cnpj = "69696969";
        e1.endereco = "Numa terra muito, mais muito distante ";
        e1.funcionariosDisponiveis = 10;

        Funcionario f1 = new Funcionario();
        f1.matricula = 1764;

        Funcionario f2 = new Funcionario();
        f2.matricula = 1234;

        Pessoa p1 = new Pessoa();
        p1.nome = "Pedro";
        p1.idade = 21;
        p1.cpf = "148.807.747.90";

        Pessoa p2 = new Pessoa();
        p2.nome = "Lucas";
        p2.idade = 20;
        p2.cpf = "123.456.789.10";

        // adicionando funcionario a empresa
        e1.adicionarFuncionario(f1);
        e1.adicionarFuncionario(f2);

        //mostrar info
        System.out.println("----Info da empresa---- ");
        e1.mostraInfo();
        System.out.println("----Info dos funcionarios---- ");
        System.out.println("Funcionario 1: ");
        f1.mostraInfo();
        System.out.println("Funcionario 2: ");
        f2.mostraInfo();
        System.out.println("----Info das pessoas---- ");
        System.out.println("Pessoa 1: ");
        p1.mostraInfo();
        System.out.println("Pessoa 2: ");
        p2.mostraInfo();



        //calcular porcentagem dos funcionarios
        System.out.println("----Porcentagem----");
        e1.contarFuncionariosDisponiveis();


        //alocando funcionario na obra
        System.out.println("funcionarios na obra");
        e1.alocarFuncionario();
    }

}
