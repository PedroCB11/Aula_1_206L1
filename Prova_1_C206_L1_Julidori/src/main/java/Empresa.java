public class Empresa {
    String nome;
    String cnpj;
    String endereco;
    int funcionariosDisponiveis;
    Funcionario[] funcionarios;

//adicionando funcionarios
    public Empresa() {funcionarios = new Funcionario[10];}

    void adicionarFuncionario(Funcionario funcionario){
    boolean flag = true;
    for (int i = 0; i < funcionarios.length;i++){
        if (funcionarios[i] == null &&  flag) {
            funcionarios[i] = funcionario;
            flag = false;
            System.out.println("Funcionario Adicionado com sucesso ");
        }
        }
        if (flag) {
            System.out.println("Nao há mais vagas para funcionarios ");
        }
    }
//mostrar informaçoes
    void mostraInfo(){
        System.out.println("Nome da empresa: " + nome);
        System.out.println("CNPJ da empresa: "+ cnpj);
        System.out.println("Endereço: "+ endereco);
        System.out.println("Numero de funcionarios disponiveis: "+funcionariosDisponiveis);

        for (Funcionario funcionario : funcionarios) { // para cada funcionario//
            if (funcionario != null) { //se nao for diferente de nulo
                funcionario.mostraInfo();
            }
        }

    }
// calcular e armazenar quantos % dos funcionarios estao disponiveis para trabalhar
    float contarFuncionariosDisponiveis(){
        float quantosPorcento;
        int totaldeFuncionarios = 0;
        int matricula = 0;

        for (Funcionario funcionario: funcionarios){
            if (funcionario != null){
                matricula += funcionario.matricula;
                totaldeFuncionarios++;
            }
        }
        quantosPorcento = (float) totaldeFuncionarios * 10;
        System.out.println("Porcentagem de funcionarios disponiveis: "+quantosPorcento);
        return quantosPorcento;
    }

    public void alocarFuncionario(int index){
       int obra =0;
        for (Funcionario funcionario: funcionarios) {
            if (funcionario != null) {
                if (funcionario.matricula.lenth ("funcionarios na obra")){
                   obra++;
               }
           }
        }



    }
}




