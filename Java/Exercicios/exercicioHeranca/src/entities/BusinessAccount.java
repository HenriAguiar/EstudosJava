package entities;

public class BusinessAccount extends Account {

    private double loanLimit;

    public BusinessAccount(String holder, int number) {
        super(holder, number);
    }

    public BusinessAccount(String holder, int number, double balance) {
        super(holder, number, balance);
        this.loanLimit+=super.balance*0.3;
    }

    @Override
    public void deposit(double value) {
        super.deposit(value);
        loanLimit+=value*0.3;
    }
    public void loan(double amount){
        if (amount >loanLimit){
            return;
        }
        loanLimit-=amount;
        super.balance+=amount;
    }

    @Override
    public String toString() {
        return "BusinessAccount{" +
                "loanLimit=" + loanLimit +
                ", holder='" + holder + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}
