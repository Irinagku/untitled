package HomeworkPractice;

import java.util.Arrays;
import java.util.Scanner;

public class replit_inner_outer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        for(int n = 0; n < words.length; n++){
            boolean unigueWord = true;
            boolean uniqueWord;
            for(int j = 0; j < words.length; j++){
                if(n != j && words[n].equals(words[j])){
                    uniqueWord = false;
                    break;
                }
            }

            if( unigueWord)
                System.out.println(words[n]);

        }
        }
    }
