import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("quantos quartos serão alugados?");
        int n= sc.nextInt();
        Pessoa novaPessoa;
        String name,email;
        int quarto;
        Pessoa[] quartos=new Pessoa[10];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o quarto alugado, nome e depois o email:");
            quarto= sc.nextInt();
            name= sc.next();
            email= sc.next();
            novaPessoa=new Pessoa(name,email);
            quartos[quarto]=novaPessoa;
        }
        System.out.println("quartos ocupados:");
        for (int i=0;i< quartos.length;i++) {
            if (quartos[i]!=null){
                System.out.printf("\n%d: "+quartos[i].getName()+", "+quartos[i].getEmail(),i);
            }
        }
    }
}