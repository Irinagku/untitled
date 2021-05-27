package day09_scanner_practice;
 import java.sql.SQLOutput;
 import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);

        System.out.println("@@@@@@ TEMPERATURE CONVERTER  @@@@@@@");
        System.out.println("Enter fahrenheit temperature: ");
        double fahrTemp = scan.nextDouble();
        Double celsiusTemp = (fahrTemp - 32) * 5/9;
        System.out.println(fahrTemp + " in Fahrenheit is " + celsiusTemp + " degrees in celsius. ");

    }
}
