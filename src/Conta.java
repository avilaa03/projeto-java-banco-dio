public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected Banco banco;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Banco banco, Cliente cliente) {
        this.banco = banco;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            saldo -= valor;
        } else if (this.saldo - valor >= -200) {
            saldo -= valor;
            System.out.println("Você entrou no crédito especial! Saldo: " + saldo);
        }else if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public int getAgencia(double valor) {
        return agencia;
    }

    public int getNumero(double valor) {
        return numero;
    }

    public double getSaldo(double valor, Conta contaDestino) {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Banco: " + this.banco.getNome()));
        System.out.println(String.format("Titular: " + this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
