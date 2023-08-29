public class EventoPlus extends EventoStandard {
    private int qtdBrinquedos;

    public EventoPlus(String data, String hora, Decoracao decoracao, Cliente cliente, String codigo, int qtdBrinquedos) {
        super(data, hora, decoracao, cliente, codigo);
        this.qtdBrinquedos = qtdBrinquedos;
    }

    public EventoPlus() {
    }

    public int getQtdBrinquedos() {
        return qtdBrinquedos;
    }

    public void setQtdBrinquedos(int qtdBrinquedos) {
        this.qtdBrinquedos = qtdBrinquedos;
    }

    @Override
    public Double calculaValor() {
        return super.getDecoracao().getValor()+(qtdBrinquedos*50);
    }

    @Override
    public String toString() {
        return super.toString()+"\nEventoPlus{" +
                "\nqtdBrinquedos=" + qtdBrinquedos +
                '}';
    }
}
