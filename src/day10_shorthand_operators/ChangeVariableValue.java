package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
         int count = 3;
        System.out.println("count = " +count);
        //add/increase  count by 2
        count = count+2;
        System.out.println("count = " + count);

        int apples  = 2;
        System.out.println("apples = " + apples);
        apples = apples + 10;
        System.out.println("apples = " + apples);
        apples = apples - 3;

        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices/2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        //get another small pizza
        pizzaSlices = pizzaSlices + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);

        int players = 10;
        System.out.println("players = " + players);
        players = players * 2;

        int cents = 244;
        System.out.println("cents = " + cents);
        //keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("remaining cents = " + cents);







    }
}
