public class Chaveiro extends Produto{
    public Chaveiro(String codigo, String nome, String descricao, double preco) {
        super(codigo, nome, descricao, preco);
    }

    public Chaveiro() {
    }

    @Override
    public double calculaPrecoVenda() {
        return (super.getPreco()*2)+(super.getPreco()*0.1);
    }
}
