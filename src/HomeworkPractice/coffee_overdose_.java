package HomeworkPractice;
import java.util.Scanner;

public class coffee_overdose_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int numOfMilligrams = scan.nextInt();
        int lethalDose = 10*1000/numOfMilligrams;



        System.out.println("It will take about "+lethalDose+" drinks for a lethal overdose");






    }
}
