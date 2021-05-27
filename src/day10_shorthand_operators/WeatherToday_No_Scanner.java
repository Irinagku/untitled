package day10_shorthand_operators;

import java.util.Scanner;

public class WeatherToday_No_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How is the weather today?");
        String weather = scan.next();
        System.out.println(weather + " - is a very mice day today!");
    }

}
