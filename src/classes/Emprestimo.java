package classes;

public class Emprestimo extends Conta {
    private double juros;
    private int numParcelas;
    public Emprestimo(int id, String titular, double saldo, double juros, int numParcelas) {
        super(id, titular, saldo);
        this.juros = juros;
        this.numParcelas = numParcelas;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void calcularJuros() {
        double jurosCalculado = saldo * juros / 100;
        saldo -= jurosCalculado;
    }
    public int getNumParcelas() {
        return numParcelas;
    }
}
