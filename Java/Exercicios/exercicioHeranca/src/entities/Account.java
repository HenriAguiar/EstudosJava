package entities;

public class Account {
    protected String holder;
    protected int number;
    protected double balance;

    public Account(String holder, int number){
        this.holder=holder;
        this.number=number;
    }
    public Account(String holder, int number, double balance){
        this.number=number;
        this.holder=holder;
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }
    public String getHolder(){
        return holder;
    }
    public void deposit(double value){
       this.balance+=value;
    }
    public void withdraw(double value){
        this.balance-=value;
    }

}
