package entities;

import java.util.Random;

public class Espada extends Item {
    public String atributo="forca";


    public Espada() {
        Random aleatorio=new Random();
        super.nome="Espada";
        super.descrição="Ela corta";
        super.nivel=aleatorio.nextInt(5)+1;
    }
    public Espada(int nivel){
        super.nome="Espada";
        super.descrição="Ela corta";
        super.nivel=nivel;
    }
    public int rolarDano(int atributo){
        Random aleatorio=new Random();
        return (aleatorio.nextInt(6))*super.nivel;
    }
}
