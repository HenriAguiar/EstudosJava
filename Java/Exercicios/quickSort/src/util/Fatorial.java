package util;

public class Fatorial {
    public static double fatorial(double valor){
        if (valor==0 || valor==1) {
            return 1;
        }
        else {
            return valor * fatorial(valor - 1);
        }
    }
}
