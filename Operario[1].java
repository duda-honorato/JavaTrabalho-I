
public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String telefone, int codigoSetor, double salarioBase, int imposto, double valorProducao, double comissao) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        if (valorProducao <  0.0) {
            throw new IllegalArgumentException("Invalido");
        }
        this.valorProducao = valorProducao;
        this.comissao = 10;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        if (valorProducao <  0.0) {
            throw new IllegalArgumentException("Invalido");
        }
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        return super.calculaSalario() + (getValorProducao() * (getComissao()/100));
    }

    @Override
    public String toString() {
        return super.toString() + "valorProducao=" + valorProducao  +
        ", comissao=" + comissao + ", SalarioTotal= " + calculaSalario();
    }

}
