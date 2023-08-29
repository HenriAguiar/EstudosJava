public class Caneca extends Produto{
    public Caneca(String codigo, String nome, String descricao, double preco) {
        super(codigo, nome, descricao, preco);
    }

    public Caneca() {
    }

    @Override
    public double calculaPrecoVenda() {
        return (super.getPreco()*2)+(super.getPreco()*0.1);
    }
}
