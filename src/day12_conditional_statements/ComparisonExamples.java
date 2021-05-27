package day12_conditional_statements;

import java.util.Scanner;


public class ComparisonExamples {
    public static void main(String[] args) {
      double accountBalance = 250.25;
      double itemPrice = 100;
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice)); //true

        boolean canAfford = accountBalance>=itemPrice;
        System.out.println("Can afford = " + canAfford);
          accountBalance -= itemPrice;

         boolean  isBroke = accountBalance<=0;
        System.out.println("Am I broke? - " + isBroke);







    }



}
