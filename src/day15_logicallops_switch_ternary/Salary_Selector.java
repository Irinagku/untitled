package day15_logicallops_switch_ternary;

public class Salary_Selector {

    public static void main(String[] args) {
        String location = "Honolulu";
        double salary = 120_000.0;
        boolean isRemote = true;
        boolean  benefits = true;

        if(location.equals("Honolulu") && salary >= 120_000 && isRemote && benefits){
            System.out.println("Sure, I will accept this offer");

        }else{
            System.out.println("Lets consider another offer or negotiate");
        }

    }
}

