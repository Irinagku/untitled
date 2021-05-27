package OfficeHours;

import java.util.Locale;

public class CharIndex {
    public static void main(String[] args) {
        String s = "java";
              //    0123

        System.out.println(s.charAt(s.length()-1));

        System.out.println(s.charAt(0) + "" + s.charAt(3));

        String upper = "" + s.toUpperCase().charAt(0) + "" + s.toUpperCase().charAt(3);
        // JAVA
        System.out.println(upper);

        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('m'));

        System.out.println(s.indexOf('j') >= 0 ? "Contains" : "Not contains");

        System.out.println(s.toLowerCase().startsWith("a"));
    }
}
