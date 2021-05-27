package HomeworkPractice;

import java.util.Arrays;
import java.util.Scanner;

public class shortWord_ {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // write your code below

        String [] strArr = str.split(", ");
        String [] shortest = {strArr[0]};
        for(String each : strArr ){
            if(each.length()<=shortest[0].length()){
                shortest[0]=each;

            }
        }
        String shortestWord = "";
        for (int i = 0; i < strArr.length; i++){
            if(shortest[0].length() == strArr[i].length()){
                shortestWord+=strArr[i]+", ";
            }
        }

        String [] result = shortestWord.split(", ");
        String shortestWorst = "";
        Arrays.sort(result);

        System.out.println(Arrays.toString(result));
    }
}