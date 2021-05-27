package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
       double bonus = 0;
       double salesAmount = 500.0;
        if(salesAmount<=2000){
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50.0;
        }else{
            System.out.println("Great job, you are qualified fo full bonus!");
            bonus = 100.00;
        }
        System.out.println("Your total bonus : $" + bonus);
    }
}
