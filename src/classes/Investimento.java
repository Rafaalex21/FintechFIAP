package classes;

public class Investimento extends Conta {
    private double juros;
    public Investimento(int id, String titular, double saldo, double juros) {
        super(id, titular, saldo);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void calcularJuros() {
        double jurosCalculado = saldo * juros / 100;
        saldo += jurosCalculado;
    }
}
