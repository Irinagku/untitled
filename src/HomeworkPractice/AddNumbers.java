

package HomeworkPractice;
 import java.util.Scanner;

 import static HomeworkPractice.Repl_14.hello;
 import static HomeworkPractice.Repl_14.world;

public class AddNumbers {
    public static void main(String[] args) {
        hello();
        world();

        Scanner scan = new Scanner(System.in);
         System.out.println(" Enter 2 numbers");

         int num1 = scan.nextInt();
         int num2 = scan.nextInt();
         int result =  num1 + num2;
         System.out.println(result);



    }


    }

