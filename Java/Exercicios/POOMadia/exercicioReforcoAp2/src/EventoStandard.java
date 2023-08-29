public class EventoStandard {
    private String data,hora,codigo;
    private Decoracao decoracao;
    private Cliente cliente;



    public EventoStandard(String data, String hora, Decoracao decoracao, Cliente cliente, String codigo) {
        this.data = data;
        this.hora = hora;
        this.decoracao = decoracao;
        this.cliente = cliente;
        this.codigo = codigo;
    }

    public EventoStandard() {
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

    public Decoracao getDecoracao() {
        return decoracao;
    }

    public void setDecoracao(Decoracao decoracao) {
        this.decoracao = decoracao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double calculaValor(){
        return decoracao.getValor();
    }


    @Override
    public String toString() {
        return "\nEventoStandard{" +
                "data='" + data + '\'' +
                ",\n hora='" + hora + '\'' +
                ",\n codigo='" + codigo + '\'' +
                ",\n decoracao=" + decoracao +
                ",\n cliente=" + cliente +
                ",\n Valor=" + calculaValor()+"\n"+
                '}';
    }
}
