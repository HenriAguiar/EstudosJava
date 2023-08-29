package Entities;

public class ContaBancaria {
    private final int accountId;
    private String accountOwner;
    private double balance;

    public ContaBancaria(int accountId, String accountOwner, double balance) {
        this.accountId = accountId;
        this.accountOwner = accountOwner;
        deposit(balance);
    }
    public ContaBancaria(int accountId, String accountOwner) {
        this.accountId = accountId;
        this.accountOwner = accountOwner;
    }
    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }
    public void deposit(double inc){
        this.balance=this.balance+inc;
    }
    public void withdraw(double dec){
        this.balance=this.balance-dec-5;
    }
    @Override
    public String toString() {
        return "Name: " + accountOwner + "; " + "Account ID: " + accountId + "; " + "Balance: " + balance + "; ";
    }
}
