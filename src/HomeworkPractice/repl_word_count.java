package HomeworkPractice;

import java.util.Scanner;

public class repl_word_count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int letterCount = sentence.length();
        int javaCount = 0;
        int pythonCount = 0;
        int tCharCount = 4;
        for(int i = 0; i <= letterCount-tCharCount; i++){
            if(sentence.substring(i, i+tCharCount).equals("java") ){
                javaCount++;
            }
        }

        tCharCount = 6;
        for(int i = 0; i <= letterCount-tCharCount; i++){
            if(sentence.substring(i, i+tCharCount).equals("python")){
                pythonCount++;
            }
        }
        System.out.println(javaCount == pythonCount);

    }
}
