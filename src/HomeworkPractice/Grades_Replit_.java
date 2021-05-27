package HomeworkPractice;
import java.util.Scanner;

public class Grades_Replit_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("@@@@@@ WELCOME TO THE GRADER! @@@@@@");

        System.out.println("Please enter subject name number 1 and score for this subject");
        String subjectName1 = s.next();
        double grade1 = s.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subjectName2 = s.next();
        double grade2 = s.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String subjectName3 = s.next();
        double grade3 = s.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subjectName4 = s.next();
        double grade4 = s.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subjectName5 = s.next();
        double grade5 = s.nextDouble();

        double averageGrade = (grade2+grade2+grade3+grade4+grade5)/5;



        System.out.println("Summary: "+ subjectName1+ " - "+grade2+", "+subjectName2+" - "+grade2+", "+subjectName3+" - "+grade3+", "+subjectName4+" - "+grade4+","+subjectName5+" - "+grade5);
        System.out.println("Your average score is: " + averageGrade);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");


    }
}
