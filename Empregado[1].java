public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private int imposto;

    public Empregado(String nome, String telefone, int codigoSetor, double salarioBase, int imposto) {
        super(nome, telefone);
        if (codigoSetor <= 0) {
            throw new IllegalArgumentException("Invalido");
        }
        if (salarioBase <  0.0) {
            throw new IllegalArgumentException("Invalido");
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
            throw new IllegalArgumentException("Invalido");
        }
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <  0.0) {
            throw new IllegalArgumentException("Invalido");
        }
        this.salarioBase = salarioBase;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }


    public double calculaSalario() {
        return getSalarioBase() - ((getImposto()/100)*getSalarioBase());
    }

    @Override
    public String toString() {
        return super.toString() + "codigoSetor= " + codigoSetor +
                ", salarioBase= " + salarioBase +
                ", imposto= " + imposto + ", SalarioTotal= " + calculaSalario();
    }
}
