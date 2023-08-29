package entities;

import java.util.Random;

public class Goblin extends Npc{
    public Goblin(int nivel, int vida, String nome, int xp) {
        super(nivel, vida, nome, xp);
    }
    public Goblin(){
        Random aleatorio=new Random();
        int nivel=aleatorio.nextInt(4)+1;
        super.nivel=nivel;
        super.vida=6*nivel;
        super.xp=15*nivel;
    }
    public int bater(){
        Random aleatorio=new Random();
        int dano=(aleatorio.nextInt(4)+1)*super.nivel;
        System.out.printf("O goblin deu %d de dano\n", dano);
        return dano;
    }

}
