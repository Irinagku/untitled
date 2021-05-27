package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {

        String word = "github";
        System.out.println(word.indexOf("g")); /// result 0
        System.out.println(word.indexOf("u"));/// count 0,1,2,3,4,5
        System.out.println(word.indexOf("hub")); /// result 3 , it shows first letter
        System.out.println(word.indexOf("java"));  //result -1 means can not find
        System.out.println(word.indexOf("t")); /// result 2
    }
}
