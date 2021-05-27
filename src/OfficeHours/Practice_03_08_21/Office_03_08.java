package OfficeHours.Practice_03_08_21;
import java.util.Scanner;
/*
Make a class Rectangle
create a main method

     - Declare two variables: length and width

         - Calculate the Perimeter 2(l*w)
         - Calculate the Area (w * l)

     - Print properties of the Rectangle

     - Modify to accept Scanner inputs
 */

public class Office_03_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your length: ");
         double length = input.nextDouble();
        System.out.println("Enter your width: ");
         double width = input.nextDouble();

         double perimeter = 2 * (length + width);
         double area = length * width;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("area = " + area);
    }


}
