public class EventoLuxo extends EventoPlus{
    private int qtdAtores;

    public EventoLuxo(String data, String hora, Decoracao decoracao, Cliente cliente, String codigo, int qtdBrinquedos, int qtdAtores) {
        super(data, hora, decoracao, cliente, codigo, qtdBrinquedos);
        this.qtdAtores = qtdAtores;
    }

    public EventoLuxo() {
    }

    public int getQtdAtores() {
        return qtdAtores;
    }

    public void setQtdAtores(int qtdAtores) {
        this.qtdAtores = qtdAtores;
    }

    @Override
    public Double calculaValor() {
        return super.calculaValor()+(qtdAtores*200);
    }

    @Override
    public String toString() {
        return super.toString()+"\nEventoLuxo{" +
                "\nqtdAtores=" + qtdAtores +
                '}';
    }
}
