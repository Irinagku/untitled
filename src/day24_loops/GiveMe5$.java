package day24_loops;
import java.util.*;
public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give me 5 dollars");

        int dollars = input.nextInt();

        while(dollars != 5){
            System.out.println("Give me 5 dollars");
                    dollars = input.nextInt();
        }
        System.out.println("Thank you for 5 dollars");
    }
}
