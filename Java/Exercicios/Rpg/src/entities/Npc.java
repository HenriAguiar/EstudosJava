package entities;

public abstract class Npc {
    int nivel,vida,xp;
    String nome;

    public Npc(int nivel, int vida, String nome,int xp) {
        this.nivel = nivel;
        this.vida = vida;
        this.nome = nome;
        this.xp = xp;
    }

    public Npc() {

    }

    public boolean subVida(int dano){
        vida-=dano;
        if (vida<=0){
            return true;
        }
        return false;
    }
    public int dropXp(){
        return xp;
    }

    @Override
    public String toString() {
        return "Npc{" +
                "nivel=" + nivel +
                ", vida=" + vida +
                ", xp=" + xp +
                ", nome='" + nome + '\'' +
                '}';
    }
}
