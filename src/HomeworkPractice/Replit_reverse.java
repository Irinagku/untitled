package HomeworkPractice;
import java.util.Scanner;

public class Replit_reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String user1 = scan.nextLine();


        if(user1.equalsIgnoreCase("Max Payne")){
            System.out.println("User found!");
        }else if(user1.equalsIgnoreCase("Alan Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }

    }
}
