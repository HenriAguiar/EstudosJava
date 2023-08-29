import entities.Produto;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String nome;
    int quant, resposta;
    double price;

        do {
            System.out.println("Qual o nome do produto? ");
            nome=sc.next();
            System.out.println("Qual o preço do produto? ");
            price=sc.nextDouble();
            System.out.println("Qual a quantidade do produto em estoque? ");
            quant=sc.nextInt();
            Produto produto = new Produto();
            produto.setName(nome);
            produto.setPrice(price);
            produto.setQuant(quant);
            System.out.println(produto.toString());
            System.out.println("Quantas unidades adicionar ao estoque?");
            produto.addinStock(sc.nextInt());
            System.out.println(produto.toString());
            System.out.println("Quantas unidades remover do estoque?");
            produto.subinStock(sc.nextInt());
            System.out.println(produto.toString());
            System.out.println("Adicionar mais um produto? [1 para sim, 0 para não]");
            resposta= sc.nextInt();



            }while (resposta==1);






        }

    }

