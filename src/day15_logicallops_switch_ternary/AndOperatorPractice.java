package day15_logicallops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        String itemName = "Glasses";
        boolean onSale = true;
        boolean freeShipping = true;

        if(onSale && freeShipping&&itemName.equals("Glasses")){
            System.out.println("Adding to cart - " + itemName);
        }else{
            System.out.println("Continue shopping for good deals on -" + itemName);
        }

        boolean location = true;
        boolean salary = true;
        boolean remote = true;
        boolean benefits = true;

        if(location&&salary&&remote&&benefits){
            System.out.println("I am ready to start working!" );
        }


    }
}
