package day15_logicallops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " +(!false));

        int age = 2;
        if (!(age>7)) {
            System.out.println("Need to sit in child car seat. age - " + age);
        }else{
            System.out.println("Can sit in normal seat . age - " + age);
        }
        
        boolean isSmokingAllowed = false;
        if(!isSmokingAllowed){
            System.out.println("Smoking is allowed ");
        }

        String carModel = "BMW";

                if(!carModel.equals("Tesla")) {
                    System.out.println("not interested");
                }
                String secretPassword = "abc123";
                String inputPassword = "abc321";
                if(!inputPassword.equals("abc123")){
                    System.out.println("incorrect");
                }

    }

}
