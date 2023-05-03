package classes;

public class Conta {
    private int id;
    private String titular;
    protected double saldo;

    public Conta(int id, String titular, double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    

	public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }
    

}
