package HomeworkPractice;
/*A fast food company has two main order types, burger meal and chicken meal.

        Both have the same prices, so if a cashier enters "burger" or "chicken " he will get the same price of 10.0.

        If the order is burger price is 10.0
        If the order is chicken price is 10.0
        If the order is soda price is 2.0
        If the order is fries price is 3.5
        hint: or operator in java is ||

        Examples:
burger
10.0
        burger
10.0
        chicken
        10.0
        chicken
        10.0
        soda
2.0*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int houseScore = scan.nextInt();
        int playerScore = scan.nextInt();

        if(playerScore > 21){
            System.out.println("player bust");
        }
        if(houseScore > playerScore){
            System.out.println("player loss");
        }

        if(playerScore==houseScore){
            System.out.println("its a tie");
        }
        if(playerScore > houseScore){
            System.out.println("player win");
        }

    }
        }