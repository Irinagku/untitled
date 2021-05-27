package HomeworkPractice;
import java.util.Scanner;
public class testPractice_ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many people do you live with?:");

        int numberOfPeople = scan.nextInt();

        if(numberOfPeople<2){
            System.out.println("Live with less than 2 people");
        }else if(numberOfPeople>=3 && numberOfPeople<=6){
            System.out.println("Live with 3-6 people");
        }else if(numberOfPeople>6){
            System.out.println("Live with more than 6 people");
        }

        System.out.println("What city do you live in?:");
        String city = scan.next();
        /*
          if (citizenship.equalsIgnoreCase("USA") || resident) {
            if (age >= 18 && age <= 35) {

                if (hasDiploma) {
                    System.out.println("You are qualified for the US Army ");
                }
            } else {
                System.out.println("Your age must be between 18 and 35 years old");
            }

        } else {
            System.out.println("You must be a U.S. citizen or a resident");
        }
         */
        System.out.println("Do you live in downtown?:");
        String downtown = scan.next();
         if(downtown.equals("yes")) {
             System.out.println("Have you thought about moving to the suburbs");
             String suburbs = scan.next();

             if (suburbs.equals("yes")) {
                 System.out.println("Do it its great");
             } else {
                 System.out.println("You should think about it");
             }


         }



    }


}
