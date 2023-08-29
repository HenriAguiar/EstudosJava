package Util;

public class Circcalc {
    private static final double PI = 3.14;

    public static double circumference(double raio) {
        return PI * 2 * raio;
    }
    public static double area(double raio){
        return PI*raio*raio;
    }
    public static double volume(double raio){
        return (4.0/3.0)*PI*raio*raio*raio;
    }
}