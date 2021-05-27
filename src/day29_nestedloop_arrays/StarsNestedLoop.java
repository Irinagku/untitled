package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {

        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print("* ");
            }
            System.out.println(""); // go to new/next line

        }


        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) { ////  b- inner a - is outer loop
                System.out.print("* ");
            }
            System.out.println(""); // go to new/next line


        }


    }
}