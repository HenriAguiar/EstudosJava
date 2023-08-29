public class Utilitario extends Veiculo{
    @Override
    public double valorDaDiaria() {
        return getValorBase()*1.3;
    }
}
