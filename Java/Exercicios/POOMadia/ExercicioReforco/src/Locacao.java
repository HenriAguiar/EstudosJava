public class Locacao implements IntLocacao{
    private int dias;
    private Veiculo veiculo;

    private String codigo, data;

    private Cliente cliente;
    private  boolean isReturned;


    public Locacao() {
        this.dias=0;
        this.isReturned=false;
    }

    public Locacao(Veiculo veiculo, String codigo, String data, Cliente cliente) {
        this.veiculo = veiculo;
        this.codigo = codigo;
        this.data = data;
        this.cliente = cliente;
        this.dias=0;
        this.isReturned=false;
        veiculo.setLocado(true);
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        veiculo.setLocado(true);
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "dias=" + dias +
                ", veiculo=" + veiculo +
                '}';
    }

    @Override
    public String devolverVeiculo(int qtDias) {
        this.veiculo.setLocado(false);
        this.dias=qtDias;
        return "Deu "+ this.valorLocacao();
    }

    @Override
    public double valorLocacao() {

        return this.dias*this.veiculo.valorDaDiaria();
    }
}
