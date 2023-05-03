package classes;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int id, String titular, double saldo, double limite) {
        super(id, titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
        } else {
            throw new RuntimeException("Saldo insuficiente");
        }
    }
}