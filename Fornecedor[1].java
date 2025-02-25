public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String telefone, double valorCredito, double valorDivida) {
        super(nome, telefone);
        if (valorCredito < 0.0) {
            throw new IllegalArgumentException("Valor de crédito inválido");
        }
        if (valorDivida < 0.0) {
            throw new IllegalArgumentException("Valor de dívida inválido");
        }
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        if (valorCredito < 0.0) {
            throw new IllegalArgumentException("Valor de crédito inválido");
        }
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        if (valorDivida < 0.0) {
            throw new IllegalArgumentException("Valor de dívida inválido");
        }
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor Crédito: " + valorCredito +
                ", Valor Dívida: " + valorDivida +
                ", Saldo: " + obterSaldo();
    }
}
