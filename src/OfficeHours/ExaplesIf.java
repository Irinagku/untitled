package OfficeHours;

public class ExaplesIf {
    public static void main(String[] args) {


        int a = 10;
        int b = a-- * 2 - --a % 2 + a;
        //      10  * 2 - 8 % 2 + 8;
        //           20 - 8 % 2 + 8;
        //           20 + 8 = 28
        System.out.println("a = " + a);
        System.out.println("b = " + b);
               

    }
}
