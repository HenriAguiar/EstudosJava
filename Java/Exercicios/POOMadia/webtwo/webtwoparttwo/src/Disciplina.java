public class Disciplina {
    private String nome, descricao, codigo, sala, data, hora;
    private int cargaHoraria;

    public Disciplina(String nome, String descricao, String codigo,int cargaHoraria, String sala, String data, String hora) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.sala = sala;
        this.data = data;
        this.hora = hora;
        this.cargaHoraria=cargaHoraria;
    }

    public Disciplina() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
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

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", codigo='" + codigo + '\'' +
                ", sala='" + sala + '\'' +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
