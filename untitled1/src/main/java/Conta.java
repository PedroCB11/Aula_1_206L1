public class Conta {

    private static int qtdCliente;
    private double saldo;

    public Conta(double saldo, Cliente c1) {
        this.saldo = saldo;
        this.c1 = c1;
        qtdCliente ++;
        System.out.println("Fui chamado");
    }

    private Cliente c1;// seta branca
    //private Cliente c1 = new Cliente();// seta preenchida

    public void deposita(double valor){
        if(valor>0){
            saldo = saldo + valor;
        }

    }
    public void saca(double valor){
        if(valor<saldo){
            saldo = saldo - valor;
        }

    }
    public void extrato(){
        System.out.println("Saldo: "+ saldo);
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getC1() {
        return c1;
    }

    public void setC1(Cliente c1) {
        this.c1 = c1;
    }

    public static int getQtdCliente() {
        return qtdCliente;
    }

    public static void setQtdCliente(int qtdCliente) {
        Conta.qtdCliente = qtdCliente;
    }
}
