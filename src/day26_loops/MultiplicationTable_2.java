package day26_loops;

public class MultiplicationTable_2 {
    public static void main(String[] args) {


        int number = 0;
        if(number<1 || number>10) {
            System.out.println("invalid number");
            return;
        }

        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));

            }
        }
    }

