public class Associacao {
    private int id;
    private String validade;

    public Associacao(int id, String validade) {
        this.id = id;
        this.validade = validade;
    }

    public Associacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", validade='" + validade + '\'' +
                '}';
    }
}
