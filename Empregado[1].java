public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, telefone);
        if (codigoSetor <= 0) {
            throw new IllegalArgumentException("Código do setor inválido");
        }
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("Salário base inválido");
        }
        if (imposto < 0 || imposto > 100) {
            throw new IllegalArgumentException("Imposto inválido");
        }
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        if (codigoSetor <= 0) {
            throw new IllegalArgumentException("Código do setor inválido");
        }
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("Salário base inválido");
        }
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        if (imposto < 0 || imposto > 100) {
            throw new IllegalArgumentException("Imposto inválido");
        }
        this.imposto = imposto;
    }

    public double calculaSalario() {
        return salarioBase - (salarioBase * (imposto / 100));
    }

    @Override
    public String toString() {
        return super.toString() + ", Código Setor: " + codigoSetor +
                ", Salário Base: " + salarioBase +
                ", Imposto: " + imposto + "%" +
                ", Salário Total: " + calculaSalario();
    }
}
