package App;
import Entities.ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int accountNumber, resp;
        String accountHolder;
        double money;
        ContaBancaria novaConta = null;

        System.out.println("Enter account number: ");
        accountNumber= sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        accountHolder=sc.nextLine();
        System.out.println("Is there a initial deposit? (1-yes/0-no)");
        resp= sc.nextInt();
        if (resp==1){
            System.out.println("What is the initial balance? ");
            money=sc.nextDouble();
            novaConta = new ContaBancaria(accountNumber,accountHolder,money);
        }
        else if(resp==0) {
            novaConta = new ContaBancaria(accountNumber,accountHolder);
        }
        System.out.println(novaConta.toString());
        System.out.println("Wanna do a deposit? (1-Y/0-N)");
        resp=sc.nextInt();
        if (resp==1){
            System.out.println("How much do you wanna to deposit?");
            money= sc.nextDouble();
            novaConta.deposit(money);
            System.out.println(novaConta);
        }
        System.out.println("Wanna do a withdraw? (1-Y/0-N)");
        resp=sc.nextInt();
        if (resp==1){
            System.out.println("How many do you wanna to withdraw?");
            money= sc.nextDouble();
            novaConta.withdraw(money);
            System.out.println(novaConta);
        }
    }
}
