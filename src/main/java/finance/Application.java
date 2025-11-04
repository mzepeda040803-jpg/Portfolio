package finance;

public class Application {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("Martha Zepeda", "097355453", 666.66);
        CreditCard creditCard = new CreditCard("Visa", "19920384", 23.15);
        Gold gold = new Gold("Grand Seiko", 12.33, 20);

        Portfolio portfolio = new Portfolio("Martha's Portfolio", "Martha");
        portfolio.add(checkingAccount);
        portfolio.add(gold);
        portfolio.add(creditCard);

        System.out.println(portfolio.getValue());
    }
}
