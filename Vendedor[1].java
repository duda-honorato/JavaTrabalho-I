public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        if (valorVendas < 0.0) {
            throw new IllegalArgumentException("Valor de vendas inválido");
        }
        if (comissao < 0 || comissao > 100) {
            throw new IllegalArgumentException("Comissão inválida");
        }
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas < 0.0) {
            throw new IllegalArgumentException("Valor de vendas inválido");
        }
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        if (comissao < 0 || comissao > 100) {
            throw new IllegalArgumentException("Comissão inválida");
        }
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        return super.calculaSalario() + (valorVendas * (comissao / 100));
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor Vendas: " + valorVendas +
                ", Comissão: " + comissao + "%" +
                ", Salário Total: " + calculaSalario();
    }
}
