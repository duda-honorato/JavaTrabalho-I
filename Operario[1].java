public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        if (valorProducao < 0.0) {
            throw new IllegalArgumentException("Valor de produção inválido");
        }
        if (comissao < 0 || comissao > 100) {
            throw new IllegalArgumentException("Comissão inválida");
        }
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        if (valorProducao < 0.0) {
            throw new IllegalArgumentException("Valor de produção inválido");
        }
        this.valorProducao = valorProducao;
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
        return super.calculaSalario() + (valorProducao * (comissao / 100));
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor Produção: " + valorProducao +
                ", Comissão: " + comissao + "%" +
                ", Salário Total: " + calculaSalario();
    }
}
