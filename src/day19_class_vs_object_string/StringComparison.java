package day19_class_vs_object_string;

import javax.lang.model.SourceVersion;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";

        System.out.println(city.equals("Chicago"));
        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("Chicago "));

        System.out.println(city.equalsIgnoreCase("Chicago")); //TRUE
        System.out.println(city.equalsIgnoreCase("CHICAGO")); //TRUE , IGNORING CASE
        System.out.println(city.equalsIgnoreCase("ChicaGo")); // TRUE
        System.out.println(city.equalsIgnoreCase("Chiicago")); // FALSE (miss spelling)
        System.out.println(city.equalsIgnoreCase("Chi cago")); // FALSE ( space )
        System.out.println(city.equalsIgnoreCase("Boston"));


        if(city.equals("CHICAGO")){
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("CHICAGO")){
            System.out.println("equalsIgnoreCase() true");
        }else{
            System.out.println("equalsIgnoreCase() false");
        }




    }
}
