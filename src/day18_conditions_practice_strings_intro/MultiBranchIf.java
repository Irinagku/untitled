package day18_conditions_practice_strings_intro;


import java.util.Scanner;

public class MultiBranchIf {
    public static void main(String[] args) {
        int num = -5;

        if(num>0){
            System.out.println(num+" is positive");
        }else if(num<0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }

    }
}
