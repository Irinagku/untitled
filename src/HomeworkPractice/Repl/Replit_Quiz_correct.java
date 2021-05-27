package HomeworkPractice.Repl;
import java.util.Scanner;
public class Replit_Quiz_correct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the farthest planet in the solar system? :");

        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");


        String a = s.nextLine();

        if(a.equals("a") || a.equals("c")){
            System.out.println(a+" is wrong answer");
        }else if(a.equals("b")){
            System.out.println(a+" is correct");
        }else{
            System.out.println(a+" is not a valid answer");
        }


    }

}
