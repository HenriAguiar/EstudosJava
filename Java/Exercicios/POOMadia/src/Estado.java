public class Estado {
    private String nome;
    private int id;

    public Estado(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Estado() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
