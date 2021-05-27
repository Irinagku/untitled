package day17_ternary_nested_conditions;
/*
String result = (score>60) ? "pass" : "fail";
 */

public class MoreTernary {
    public static void main(String[] args) {

        double hourlyRate = 50;
        String reply ;

        reply = (hourlyRate>45) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todaysClass = "java";

        String teacher = (todaysClass.equals("java") )? "Muradil/Saim":"Nadir";
        System.out.println("Today's teacher = " + teacher);

        boolean isEligibleToDrive = true;

        String driving = (isEligibleToDrive)?"have drivers license, can drive":"No dl, cannot drive";
        System.out.println("driving = " + driving);

    }
}
