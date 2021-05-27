package HomeworkPractice;
import java.util.Scanner;

public class Contains_Repl { //// not correct , from Replit ,,  need to finish


        /*
         if  (countryCode.equals(countryCode.toUpperCase())) {
               String email = "irinagku@gmail.com";
        if(email.contains("@") && email.contains(".com")){
            System.out.println("valid email");
        }else{
            System.out.println("invalid email");
         */


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();
            String sentence = scan.nextLine();
            //WRITE YOUR CODE HERE
            sentence = "sentence";

            if(sentence.contains("word")){

                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }


}