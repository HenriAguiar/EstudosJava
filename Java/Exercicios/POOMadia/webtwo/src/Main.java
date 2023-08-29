import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Liquidificador liquidificador= new Liquidificador("A","AA","AAA",400,4,4);
        liquidificador.aumentarModo();
        liquidificador.aumentarModo();
        liquidificador.aumentarModo();
        liquidificador.aumentarModo();
        liquidificador.aumentarModo();
        liquidificador.aumentarModo();
        System.out.println(liquidificador.getModoAtual());
        Fogao fogao = new Fogao("A","AA","AAA",400,4,4);
        fogao.acenderBoca(1);
        System.out.println(fogao.numBocasAcessas());
    }
}