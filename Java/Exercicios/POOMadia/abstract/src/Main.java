import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Produto> lista= new ArrayList<>();
        lista.add(new Camiseta("a","b","c", 50.0, "d"));
        lista.add(new Caneca("a","b","c", 30.0));
        lista.add(new Chaveiro("a","b","c", 20.0));

        System.out.println("preço camiseta: \n");
        System.out.println(lista.get(0).calculaPrecoVenda());

        System.out.println("preço caneca: \n");
        System.out.println(lista.get(1).calculaPrecoVenda());

        System.out.println("preço chaveiro: \n");
        System.out.println(lista.get(2).calculaPrecoVenda());
    }


}
