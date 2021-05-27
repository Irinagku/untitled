package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";

        /*
        word.substing(startIndex, endIndex)
         */

        System.out.println(word.substring(0,4));
        System.out.println(word.substring(0,7));

        System.out.println(word.substring(5,7)); // print is
        System.out.println(word.substring(8,11)); // will print fun

        System.out.println(word.substring(8));
        System.out.println(word.substring(5));


    }
}
