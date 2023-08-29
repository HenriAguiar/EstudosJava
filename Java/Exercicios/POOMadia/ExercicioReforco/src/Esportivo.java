public class Esportivo extends Veiculo{
    @Override
    public double valorDaDiaria() {
        return getValorBase()*1.5;
    }
}
