package entities;

public class Item {
    public String nome,descrição;
    public int nivel=1;

    @Override
    public String toString() {
        return "nome='" + nome + '\'' + ", nivel=" + nivel;

    }

}
