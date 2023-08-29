public class Camiseta extends Produto{
    private String tamanho;

    public Camiseta(String codigo, String nome, String descricao, double preco, String tamanho) {
        super(codigo, nome, descricao, preco);
        this.tamanho = tamanho;
    }

    public Camiseta() {
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public double calculaPrecoVenda() {
        return (super.getPreco()*2)+(super.getPreco()*0.075);
    }
}
