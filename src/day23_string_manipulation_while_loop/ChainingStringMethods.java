package day23_string_manipulation_while_loop;
/*
  String text = message.substring( message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);
 */

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den spo on";

        System.out.println(word.toUpperCase().toLowerCase());

        System.out.println(word.replace(" ","").toUpperCase());
        
  //***********************************************************************************      

        String city = "chicago";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));
        
        String capitalized = (city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        System.out.println("capitalized = " + capitalized);

    }
}
