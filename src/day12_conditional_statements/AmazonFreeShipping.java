package day12_conditional_statements;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your order total price:");
        double totalPrice = scan.nextDouble();

        if (totalPrice>=25.0){
            System.out.println("FREE SHIPPING ELIGIBLE" );
        }else{
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING.YOUR ORDER IS LESS THAN MINIMUM OF $25.");
        }

        System.out.println("THANKS FOR SHOPPING WITH AMAZON!");


    }
}
