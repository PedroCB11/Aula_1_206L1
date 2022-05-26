public class Main {
    public static void main(String[] args) {
        System.out.println(Conta.getQtdCliente());
        Cliente cliente1 = new Cliente();
        System.out.println(Conta.getQtdCliente());
        Conta conta1 = new Conta(0,cliente1);

        System.out.println("Bem vindo");

        conta1.deposita(500);
        conta1.saca(200);
        conta1.extrato();

        System.out.println(Conta.getQtdCliente());






    }
}
