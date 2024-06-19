public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar() {

    }

    public void depositar(double valor) {

    }

    public void transferir() {

    }

    @Override
    public int getAgencia(double valor) {
        return 0;
    }

    @Override
    public int getNumero(double valor) {
        return 0;
    }

    @Override
    public double getSaldo(double valor, Conta contaDestino) {
        return 0;
    }
}
