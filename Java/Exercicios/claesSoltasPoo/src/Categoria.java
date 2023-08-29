public class Categoria {
    private String nome;
    private double imposto;

    public Categoria(String nome, double imposto) {
        this.nome = nome;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public double getImposto() {
        return imposto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", imposto=" + imposto +
                '}';
    }
}
