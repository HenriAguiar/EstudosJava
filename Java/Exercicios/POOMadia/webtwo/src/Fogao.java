import java.util.Arrays;

public class Fogao extends Eletrodomestico {
    private Boca[] bocas;
    private int numeroDeBocas;

    public Fogao(String marca, String modelo, String descricao, double preco, int garantia, int numeroDeBocas) {
        super(marca, modelo, descricao, preco, garantia);
        this.numeroDeBocas = numeroDeBocas;
        bocas = new Boca[numeroDeBocas];
        for (int i = 0; i < numeroDeBocas; i++) {
            bocas[i] = new Boca();
        }
    }

    public Fogao() {
    }

    public int getNumeroDeBocas() {
        return numeroDeBocas;
    }

    public void setNumeroDeBocas(int numeroDeBocas) {
        this.numeroDeBocas = numeroDeBocas;
    }

    public void apagarBoca(int boca){
            if (boca > 0 && boca < numeroDeBocas) {
                bocas[boca].apagar();
            }
        }
    public void acenderBoca(int boca){
        boca--;
        if (boca >= 0 && boca < numeroDeBocas) {
            bocas[boca].acender();
        }
    }
    public int numBocasAcessas () {
        int i = 0;
        for (Boca boca : bocas) {
            if (boca.isAcessa()) {
                i++;
            }
        }
        return i;
    }

    @Override
    public String toString() {
        return "Fogao{" +
                "numeroDeBocas=" + numeroDeBocas +
                '}';
    }
}


