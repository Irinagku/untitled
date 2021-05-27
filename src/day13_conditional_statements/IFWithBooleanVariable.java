package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;

// does not run everything!!!!!!!!!!!!!
        if (isHungry == true) {
            System.out.println("I am hungry, I will go get something to eat.");
            System.out.println("Then code java.");
        } else {
            System.out.println("I am not coding, I will keep coding java!");

            double price = 130.44;
            boolean isAffordable = price <= 200.0;

            System.out.println("is Affordable = " + isAffordable);
            if (isAffordable) {
                System.out.println("I can afford it, lets buy!");
            } else {
                System.out.println("Too expensive, lets keep coding java");

                boolean isRemoteJob = true;
                if (isRemoteJob == false) {
                    System.out.println("Sorry, I am not interested");
                } else {
                    System.out.println("Sure, I am interested, what is the interview process?");

                }
            }

        }
    }
}