package HomeworkPractice;
import java.util.Scanner;
public class negative_positive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        //your code here
  char answer;
        if(num==+(num)){
            System.out.println("positive");
        }else if(num==-(num)){
            System.out.println("negative");
        }else if(num==(0)){
            System.out.println("zero");
        }



    }
}
