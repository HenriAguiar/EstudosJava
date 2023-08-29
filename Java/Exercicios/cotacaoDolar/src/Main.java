import util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double cotacao, quant;
        Scanner sc= new Scanner(System.in);
        System.out.println("qual a cotação do dolar?");
        cotacao= sc.nextDouble();
        System.out.println("quantos dolares queres comprar?");
        quant= sc.nextDouble();
        System.out.println(CurrencyConverter.dolarReal(cotacao,quant));

    }
}