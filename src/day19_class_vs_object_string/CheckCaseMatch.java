package day19_class_vs_object_string;

import java.util.Locale;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "USA";
        if  (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("Pass - case is correct");
        } else {
            System.out.println("Fail - case in incorrect");
        }
    }
}
