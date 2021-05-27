package OfficeHours.Practice_03_15;

public class OperatorAnalyze {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + a-- + a * 2 + a + ++a;
        /*
        5+6+5*2+5+6=32
         */
        System.out.println("a " + a);
        System.out.println(b);
    }
}
