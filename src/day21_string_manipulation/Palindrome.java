package day21_string_manipulation;

public class Palindrome {
    public static void main(String[] args) {

        String word = "MOM";
        char first = word.charAt(0);
        char last = word.charAt(2);

        if(first == last){
            System.out.println("first and last letters match");
        }else{
            System.out.println("first and last letters mismatch");
        }
                     /////new one    /////////

        String friend = "aziza";
        char firstletter = friend.charAt(0);
        char lastCharacter = friend.charAt(friend.length() -1);

        System.out.println(firstletter);
        System.out.println(lastCharacter);

        if(firstletter == lastCharacter){
            System.out.println(friend+ "- first and last match");
        }else{
            System.out.println(friend+ "- first and last mismatch");
        }


        ////next one/////

        String word2 ="java";
        System.out.println(word2.indexOf("j"));
    }
}
