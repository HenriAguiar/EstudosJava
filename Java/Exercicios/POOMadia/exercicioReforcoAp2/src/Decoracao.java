public class Decoracao {
    private String tema,descricao,codigo;
    private Double valor;

    public Decoracao(String tema, String descricao, String codigo, Double valor) {
        this.tema = tema;
        this.descricao = descricao;
        this.codigo = codigo;
        this.valor = valor;
    }

    public Decoracao() {
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Decoracao{" +
                "tema='" + tema + '\'' +
                ", descricao='" + descricao + '\'' +
                ", codigo='" + codigo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
