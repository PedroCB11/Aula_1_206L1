import br.inatel.cdg.Arquiteto;
import br.inatel.cdg.Engenheiro;
import br.inatel.cdg.Funcionario;
import br.inatel.cdg.Professor;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[5]; // PODEMOS CRIAR UMA ARRAY DA CLASSE MAE, REFERENCIA PARA 5 OBJETOS;
        //Funcionario func;  //REFERENCIA PARA UM OBJETO, QUADRADO DE SETA BRANCA;

        //DEFININDO NOME, IDADE, ETC.. (APÓS A CRIAÇAO DO CONSTRUTOR)
        Engenheiro engenheiro1 = new Engenheiro("Pedro Bressan",21,10000.00,"Computaçao");
        //engenheiro1.setNome("Pedro Bressan");
        // engenheiro1.setIdade(21);
        // engenheiro1.setSalario(10000.00);
        // engenheiro1.setRamo("Computaçao");

        Professor professor1 = new Professor("Julidori",20,5000.00,"C206");
        //professor1.setNome("Julidori");
        //professor1.setIdade(20);
        //professor1.setSalario(50000.00);
        //professor1.setMateria("C206");

        Arquiteto arquiteto1 = new Arquiteto("Caio",20,15000.00,"Gadear meninas sub15");

        funcionarios[0] = engenheiro1;
        funcionarios[1] = professor1;    // PODEMOS GUARDAR OBJETOS DA CLASSE FILHA NO ARRAY DA MAE
        funcionarios[2] = arquiteto1;



        System.out.println("---------utilizando get set----------");

        System.out.println("Nome: " + engenheiro1.getNome());
        System.out.println("Idade: "+ engenheiro1.getIdade());
        System.out.println("Salario: "+ engenheiro1.getSalario());
        System.out.println("Ramo: "+ engenheiro1.getRamo());




        System.out.println("-------UTILIZANDO MOSTRA INFO-------");
        System.out.println("---info do Engenheiro---");
        engenheiro1.MostraInfo(); //puxa os sout do mostraInfo

        System.out.println("Salario com bonus: " + engenheiro1.SalarioBonus());// puxa o salario + salario bonus do engenheiro

        System.out.println(" ---info do professor---");
        professor1.MostraInfo(); // puxa os sout do mostra info do professor ( com o super no override do mostra info do professor)

        System.out.println(" --- info do Arquiteto ---" );
        arquiteto1.MostraInfo();

        System.out.println("oque o eng esta fazendo ");
        engenheiro1.ExecutaAcao();
        System.out.println("oque o prof esta fazendo ");
        professor1.ExecutaAcao();
        System.out.println("oque o arq esta fazendo ");
        arquiteto1.ExecutaAcao();


        System.out.println("------------depois do for --------");
        // PARA PERCORRER O ARRAY E VERIFICAR A INSTANCIA DE CADA OBJETO ATRAVEZ DO "INSTANCE OF";
        for (int i=0; i < funcionarios.length;i++){
            if(funcionarios[i] != null){
                if(funcionarios[i] instanceof Engenheiro){
                    System.out.println("Esta posiçao contem um engenheiro");
                    Engenheiro eng = (Engenheiro) funcionarios[i];
                    eng.MostraInfo();
                    eng.ExibeSalarioAnual();// PARA CHAMAR A FUNÇAO ESPECIFICA; TEM QUE SER DENTRO DO IF, DEPOIS DE DIZER QUE FUNCIONARIOS É UM ENGENHEIRO
                    eng.ExecutaAcao();
                    eng.gerenciar(); // CHAMANDO A FUNÇAO DA INTERFACE
                }

                else if (funcionarios[i]instanceof Professor){
                    System.out.println("Esta posiçao contem um professor");
                    Professor prof = (Professor) funcionarios[i];
                    prof.MostraInfo();
                    prof.ExecutaAcao();

                }else {
                    System.out.println("Esta posiçao contem um arquiteto");
                    Arquiteto arq = (Arquiteto) funcionarios[i];
                    arq.MostraInfo();
                    arq.ExecutaAcao();
                    arq.gerenciar();
                }
            }
        }

    }
}
