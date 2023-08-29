public class VisitanteAssociado extends Visitante {
    private Associacao associacao;

    public VisitanteAssociado(String nome, String CPF, String telefone, Cidade cidade, int numeroAssociacao, String validadeAssociacao) {
        super(nome, CPF, telefone, cidade);
        associacao = new Associacao(numeroAssociacao, validadeAssociacao);

    }
    public int getNumAssociacao(){
        return associacao.getId();
    }
    public String getValidadeAssociacao(){
        return associacao.getValidade();
    }

    @Override
    public String toString() {
        return super.toString()+"VisitanteAssociado{" +
                "associacao=" + associacao.toString() +
                '}';
    }
}