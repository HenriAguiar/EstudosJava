package application;
import entities.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Numero de entradas: ");
        int n=sc.nextInt();
        Pessoa[] pessoas= new Pessoa[n];
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("nome:");
            String nome= sc.next();
            System.out.println("idade:");
            int idade= sc.nextInt();
            System.out.println("altura");
            double altura= sc.nextDouble();
            pessoas[i]=new Pessoa(nome,idade,altura);
        }
        System.out.println(retornaMedia(pessoas));
        System.out.println(percentualMenorQue(pessoas,16));

    }
    public static String retornaMedia(Pessoa[] list){
        double soma=0.0;
        for (int i = 0; i < list.length; i++) {
            soma+=list[i].getHeight();
        }
        return String.format("%.2f",soma/ list.length);
    }
    public static String percentualMenorQue(Pessoa[] list, double key){
        int cont=0;
        double percentual = 0.0;
        String nomes="";
        for (Pessoa pessoa : list) {
            if (pessoa.getAge() < key) {
                cont += 1;
                nomes+= pessoa.getName()+"%n";
            }
        }
        percentual = (cont / (list.length / 100.0));
        return String.format("%.2f%n"+nomes,percentual);
    }
}


