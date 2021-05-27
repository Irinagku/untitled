package OfficeHours;
import java.util.Scanner;

public class Email_Replit_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words");
        String wordOne = input.nextLine();
        String wordTwo = input.nextLine();
        String email = "";

        if(wordOne.length() >= 6 && wordTwo.length() >=6){

            email = wordOne.substring(0,4);
            email += wordTwo.substring(wordTwo.length()-3);
            email += "@cyberteck.com";

        }else{
            System.out.println("Invalid data");
        }
    }
}
