package entities;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int forca, int destreza, int inteligencia) {
        super(nome, forca, destreza, inteligencia);
        Espada arma=new Espada(1);
        super.dadoDeVida=12;
        super.vidaMax=12;
        super.vidaAtual=12;
        super.nivel=1;
        super.arma=arma;
    }
    public int bater(){
        Espada arma1 = (Espada) super.arma;
        int dano=arma1.rolarDano(super.forca);
        System.out.printf("Você deu %d de dano \n",dano);
        return dano;
    }


    @Override
    public final String addXp(int xp){
        this.xp+=xp;
        int xpMax = 200;
        if (xp>= xpMax){
            this.nivel+=1;
            this.xp-= xpMax;
            this.vidaMax+=dadoDeVida;
            this.vidaAtual=vidaMax;
            this.forca+=1;
            return "Você ganhou um nivel!!!!";
        }
        return "";
    }


}
