package day25_loop__;

public class PrintStars_ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 15; i++) {
            System.out.print(" * ");

        }

        String myStars = "";

        for (int i = 0; i <= 5; i++) {
            myStars += "* ";
        }

            System.out.print("myStars = " + myStars.trim());
        }

    }
