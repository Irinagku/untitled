package HomeworkPractice;
import java.util.Scanner;

public class Grade_2_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String sub1 = s.next();
        double score1 = s.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String sub2 = s.next();
        double score2 = s.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String sub3 = s.next();
        double score3 = s.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String sub4 = s.next();
        double score4 = s.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String sub5 = s.next();
        double score5 = s.nextDouble();

        double averageScore = (score1+score2+score3+score4+score5)/5;
        System.out.println("Summary: "+sub1+" - "+score1+", "+sub2+" - "+score2+", "+sub3+" - "+score3+", "+sub4+" - "+score4+", "+sub5+" - "+score5);
        System.out.println("Your average score is: "+averageScore);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");
    }
}
