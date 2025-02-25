public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;


    public Vendedor(String nome, String telefone, int codigoSetor, double salarioBase, int imposto, double comissao, double valorVendas) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        if (valorVendas <  0.0) {
            throw new IllegalArgumentException("Invalido");
        }
        this.comissao = 10;
        this.valorVendas = valorVendas;
    }


    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas <  0.0) {
            throw new IllegalArgumentException("Invalido");
        }
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    @Override
    public double calculaSalario() {
        return super.calculaSalario() + (getValorVendas() * (getComissao()/100));
    }

    @Override
    public String toString() {
        return super.toString() +" valorVendas=" + valorVendas +
                ", comissao=" + comissao + ", SalarioTotal= " + calculaSalario();
    }
}
