package day19_class_vs_object_string;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "inteliji idea";
        System.out.println(word.startsWith("i")); //true
        System.out.println(word.startsWith("in")); //true
        System.out.println(word.startsWith("int")); //true
        System.out.println(word.startsWith("inteliji")); //ture
        System.out.println("java".startsWith("j")); //true
        System.out.println(word.endsWith("idea")); //true

        String firstName = "Mr.Nadir";
        if (firstName.startsWith("Mr.")) {

            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("Married women");
        } else if (firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        } else {
            System.out.println("Normal person");
        }


        String url = "https : // www.Irina's.com";

        if (url.endsWith(".com")) {
            System.out.println(url + " is Commercial website");
        } else if (url.endsWith(".ru")) {
            System.out.println(url + " is Russian website");
        } else if (url.endsWith(".gov")) {
            System.out.println(url + " is Government website");
        } else if (url.endsWith(".edu")) {
            System.out.println(url + " is Educational website");
        } else if (url.endsWith(".org")) {
            System.out.println(url + " is Organization website");
        }


    }
}
