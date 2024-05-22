public class Main {
    public static void main(String[] args) {

        Cliente mateus = new Cliente();
        mateus.setNome("Mateus");

        Conta cc = new ContaCorrente(mateus);
        Conta bb = null;
        cc.depositar(100);
        Conta cp = new ContaPoupanca(mateus);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cp.sacar(67);
        cp.imprimirExtrato();

    }
}
