package app;

import entities.BusinessAccount;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        int numeroConta;
        Double saldo,deposito,emprestimo;
        BusinessAccount novaConta;
        System.out.println("Nome do titular da conta:");
        nome = sc.next();
        System.out.println("Numero da conta:");
        numeroConta= sc.nextInt();
        System.out.println("Deseja inicializar o saldo?");
        String resp= sc.next();
        if (resp.equals("sim")){
            System.out.println("Qual o saldo inicial?");
            saldo=sc.nextDouble();
            novaConta=new BusinessAccount(nome,numeroConta,saldo);
        }
        else{
            novaConta=new BusinessAccount(nome,numeroConta);
        }
        System.out.println(novaConta.toString());
        System.out.println("faca um deposito: ");
        novaConta.deposit(sc.nextDouble());
        System.out.println(novaConta.toString());
        System.out.println("faca um emprestimo: ");
        novaConta.loan(sc.nextDouble());
        System.out.println(novaConta.toString());
        System.out.println("faca um saque: ");
        novaConta.withdraw(sc.nextDouble());
        System.out.println(novaConta.toString());



    }
}
