public abstract class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone inválido");
        }
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone inválido");
        }
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}
