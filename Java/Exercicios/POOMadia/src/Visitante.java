public class Visitante {
    private String nome, CPF, telefone;
    private Cidade cidade;

    public Visitante(String nome, String CPF, String telefone, Cidade cidade) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    public Visitante() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
