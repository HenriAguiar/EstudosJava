public abstract class Veiculo {
    private int cod;
    private String placa, modelo;
    private boolean locado;
    private static double valorBase;
    public Veiculo() {
        locado = false;
    }
    public Veiculo(int codigo, String placa, String modelo) {
        this.cod = codigo;
        this.placa = placa;
        this.modelo = modelo;
        locado = false;
    }
    public int getCodigo() {
        return cod;
    }
    public void setCodigo(int codigo) {
        this.cod = codigo;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean isLocado() {
        return locado;
    }
    public void setLocado(boolean locado) {
        this.locado = locado;
    }
    public static double getValorBase() {
        return valorBase;
    }
    public static void setValorBase(double valorBase) {
        Veiculo.valorBase = valorBase;
    }
    @Override
    public String toString() {
        return "Veiculo{" + "codigo=" + cod + ", placa=" + placa + ", modelo=" + modelo + ", locado=" + locado + '}';
    }
    public abstract double valorDaDiaria();
}
