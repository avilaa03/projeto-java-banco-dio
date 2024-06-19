public interface IConta {
    public int getAgencia(double valor);

    public int getNumero(double valor);

    public double getSaldo(double valor, Conta contaDestino);
}
