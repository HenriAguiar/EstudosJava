public class Cidade {
    private int id;
    private Estado estado;
    private String nome;

    public Cidade(int id, Estado estado, String nome) {
        this.id = id;
        this.estado = estado;
        this.nome = nome;
    }


    public Cidade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "id=" + id +
                ", estado=" + estado +
                ", nome='" + nome + '\'' +
                '}';
    }
}
