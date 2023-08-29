public class Liquidificador extends Eletrodomestico{
    private int modoAtual;
    private int modoMaximo;

    public Liquidificador(String marca, String modelo, String descricao, double preco, int garantia, int modoMaximo) {
        super(marca, modelo, descricao, preco, garantia);
        this.modoMaximo = modoMaximo;
        this.modoAtual=0;
    }

    public Liquidificador() {
    }


    public int getModoMaximo() {
        return modoMaximo;
    }

    public void setModoMaximo(int modoMaximo) {
        this.modoMaximo = modoMaximo;
    }

    public int getModoAtual() {
        return modoAtual;
    }

    public void aumentarModo(){
        if (modoAtual<modoMaximo){
            modoAtual++;
        }
    }
    public void diminuirModo(){
        if (modoAtual>0){
            modoAtual--;
        }
    }

    @Override
    public String toString() {
        return "Liquidificador{" +
                "modoAtual=" + modoAtual +
                ", modoMaximo=" + modoMaximo +
                '}';
    }
}


