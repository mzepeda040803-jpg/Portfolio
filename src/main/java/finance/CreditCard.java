package finance;

public class CreditCard extends Account{
    public CreditCard(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public double getValue() {
        return getBalance();
    }

    public double charge(double amount) {
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
        return newBalance;
    }

    public double pay(double amount) {
        double newBalance = getBalance() - amount;
        setBalance(newBalance);
        return newBalance;
    }
}
