import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jô Soares");
        Cliente cliente2 = new Cliente("Neymar Jr");

        Banco itau = new Banco("Itaú Unibanco");
        Banco bradesco = new Banco("Bradesco");

        Conta cc = new ContaCorrente(itau, cliente1);
        Conta cp = new ContaPoupanca(bradesco, cliente2);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.sacar(200);
        cc.sacar(199);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}
