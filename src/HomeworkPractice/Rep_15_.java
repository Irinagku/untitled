package HomeworkPractice;
/*
Write a program that will print the shortest word in the given array str.

input: java, cable, red, vivid, remedy, grace

output: red   String[] wordsInSentence = sentence.split(" ");
 */

import java.util.Arrays;
import java.util.Scanner;

public class Rep_15_ {
    public static void main(String[] args) {
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String[] words = str.split(", ");
        System.out.println(Arrays.toString(words));

        String shortestWord = words[0];
        String allWords = "";

        for (String eachWord : words) {
            if (eachWord.length() < shortestWord.length()) {
                shortestWord = eachWord;

            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == shortestWord.length()) {
                allWords += words[i] + " ";
            }
        }
        String[] shortWords = allWords.split(" ");
        Arrays.sort(shortWords);
        System.out.println(Arrays.toString(shortWords));
    }
}



