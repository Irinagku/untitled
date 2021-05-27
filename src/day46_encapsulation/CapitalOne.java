package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(433636777733L);
        acc.setBalance(500);
        acc.setAccountHolder("Mike Smith");
        acc.setType("checking");

        System.out.println(acc);
    }
}
