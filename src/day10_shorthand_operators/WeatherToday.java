package day10_shorthand_operators;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.println("How is weather today?: ");

        String weather = scan.next();

        System.out.println(weather + " -  is a nice day today!");



    }
}
