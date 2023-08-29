public class Produto {
    private int codigo;
    private String nome;
    private Categoria categoria;
    private double precoFornecedor;

    public Produto(int codigo, String nome, Categoria categoria, double precoFornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.precoFornecedor = precoFornecedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria.getNome();
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecoFornecedor() {
        return precoFornecedor;
    }

    public void setPrecoFornecedor(double precoFornecedor) {
        this.precoFornecedor = precoFornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", categoria=" + categoria +
                ", precoFornecedor=" + precoFornecedor +
                '}';
    }
}
