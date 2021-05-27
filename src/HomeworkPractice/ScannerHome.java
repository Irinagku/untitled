package HomeworkPractice;

import java.util.Scanner;

public class ScannerHome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your favorite food? ");

        String favoriteFood = input.next();

        System.out.println("The " + favoriteFood +  " is not a healthy food ! ");


    }
}
