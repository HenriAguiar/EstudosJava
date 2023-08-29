package app;

import entities.Espada;
import entities.Goblin;
import entities.Guerreiro;
import entities.Pocao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guerreiro erick=new Guerreiro("erick",2,1,0);
        Goblin goblin=new Goblin(1,9,"goblin",200);
        while (true){
            if (goblin.subVida(erick.bater())){
                System.out.println("o goblin morreu");
                System.out.println(erick.addXp(goblin.dropXp()));
                Espada aEspada = new Espada();
                erick.pegarItem(aEspada);
                break;
            };
            if (erick.subVida(goblin.bater())){
                System.out.println("você morreu");
                break;
            }
        }
        Espada novaEspada = new Espada();
        erick.pegarItem(novaEspada);
        erick.verInventario();
        System.out.println(erick.getArma().toString());
        System.out.println("qual item deseja equipar");
        erick.equiparItem(sc.nextInt());
        erick.verInventario();
        System.out.println(erick.getArma().toString());
        System.out.println(erick.toString());
        Goblin goblinn = new Goblin();
        System.out.println("apareceu outro goblin, meter a mão na cara dele?");
        if (sc.nextInt()==1){
            while (true){
                System.out.println(goblinn.toString());
                if (goblinn.subVida(erick.bater())){
                    System.out.println("o goblin morreu");
                    System.out.println(erick.addXp(goblinn.dropXp()));
                    Pocao pocao = new Pocao();
                    erick.pegarPocao(pocao);
                    break;
                };
                if (erick.subVida(goblinn.bater())){
                    System.out.println("você morreu");
                    break;
                }
            }
        }
        System.out.println(erick.toString());
        erick.verPocoes();
        System.out.println("qual poção você quer usar?");
        erick.usarPocao(sc.nextInt());
        System.out.println(erick.toString());


    }
}