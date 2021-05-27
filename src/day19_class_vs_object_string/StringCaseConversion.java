package day19_class_vs_object_string;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CybeRTek";
        String sentence = "Java IS Fun!";

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());
        
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);

        word = word.toLowerCase();
        System.out.println("word" + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in upper case - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
