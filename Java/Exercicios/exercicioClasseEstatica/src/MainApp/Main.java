package MainApp;

import Util.Circcalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resposta=0;
        double raio;
        Scanner sc = new Scanner(System.in);
        while (resposta!=4) {
            System.out.println("o que deseja fazer?");
            System.out.printf("1-calcular area da circunferencia%n2-calcular volume da esfera%n3-calcular comprimento da circunferencia%n4-Sair%n");
            resposta= sc.nextInt();
            switch (resposta) {
                case 1 -> {
                    System.out.println("digite o raio do circulo: ");
                    raio = sc.nextDouble();
                    System.out.println(Circcalc.area(raio));
                }
                case 2 -> {
                    System.out.println("digite o raio do circulo: ");
                    raio = sc.nextDouble();
                    System.out.println(Circcalc.volume(raio));
                }
                case 3 -> {
                    System.out.println("digite o raio do circulo: ");
                    raio = sc.nextDouble();
                    System.out.println(Circcalc.circumference(raio));
                }
            }

        }
    }
}