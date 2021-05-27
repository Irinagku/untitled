package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {

        double initialBalance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;
        double remainingBalance = (initialBalance-price1-price2-price3);
        int balanceWithNoCents = (int) remainingBalance;



        System.out.println( "Initial balance is :  $" + initialBalance);
        System.out.println( "Remaining balance is :$" + remainingBalance);
        System.out.println("My balance with no change is: $" + balanceWithNoCents);


    }
}
