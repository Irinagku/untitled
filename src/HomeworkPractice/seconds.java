package HomeworkPractice;

import java.util.Scanner;
public class seconds {
    public static void main(String[] args){
        int inputSeconds, hours, minutes, seconds;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter seconds:");

        inputSeconds = scan.nextInt();

        hours = inputSeconds / 3600 ;
        int remainingSec = inputSeconds % 3600;
        minutes = remainingSec / 60;
        seconds = remainingSec % 60;
        System.out.println( hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");

    }

}
