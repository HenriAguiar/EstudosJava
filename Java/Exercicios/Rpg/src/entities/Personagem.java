package entities;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Personagem {
    public int vidaMax;
    public int vidaAtual;
    public int nivel;
    public int xp;
    public String nome;
    public int dadoDeVida;
    public int forca, destreza, inteligencia;
    public ArrayList<Item> inventario=new ArrayList<>();
    public ArrayList<Pocao> pocoes=new ArrayList<>();
    public Item arma;

    public Personagem(String nome, int forca, int destreza, int inteligencia) {
        this.nome = nome;
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getNivel() {
        return nivel;
    }

    public int getXp() {
        return xp;
    }

    public String getNome() {
        return nome;
    }

    public int getDadoDeVida() {
        return dadoDeVida;
    }

    public int getForca() {
        return forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public Item getArma() {
        return arma;
    }

    public boolean subVida(int dano){
        vidaAtual-=dano;
        if (vidaAtual<=0){
            return true;
        }
        return false;
    }
    public boolean isAlive(){
        if (vidaAtual>0){
            return true;
        }
        return false;
    }
    public void heal(int heal){
        this.vidaAtual+=heal;
        if (vidaAtual>vidaMax){
            vidaAtual=vidaMax;
        }
    }
    public String addXp(int xp){
        this.xp+=xp;
        int xpMax = 200;
        if (xp>= xpMax){
            this.nivel+=1;
            this.xp-= xpMax;
            this.vidaMax+=dadoDeVida;
            this.vidaAtual=vidaMax;
            return "Você ganhou um nivel!!!!";
        }
        return "";
    }
    public boolean pegarItem(Item item){
        if (this.inventario.size()<10){
            inventario.add(item);
            return true;
        }
        return false;

    }
    public boolean pegarPocao(Pocao pocao){
        if (pocoes.size()<4){
            pocoes.add(pocao);
            return true;
        }
        return false;

    }
    public String verInventario(){
        System.out.println(inventario.toString());
        return inventario.toString();
    }
    public String verPocoes(){
        System.out.println(pocoes.toString());
        return pocoes.toString();
    }
    public void usarPocao(int i){
        i-=1;
        heal(pocoes.get(i).usar());
        pocoes.remove(i);

    }
    public void equiparItem(int i){
        Item pivo=arma;
        arma=inventario.get(i-1);
        inventario.remove(i-1);
        inventario.add(pivo);
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "vidaAtual=" + vidaAtual +
                ", nivel=" + nivel +
                ", xp=" + xp +
                '}';
    }
}
