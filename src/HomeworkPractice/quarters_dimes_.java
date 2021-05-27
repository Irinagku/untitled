package HomeworkPractice;
import java.util.Scanner;

public class quarters_dimes_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String purchase = s.next();
        int giftCard = 100;


        if(purchase.equals("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: "+(giftCard-60)+"$");
        }else if(purchase.equals("Charger")){
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: "+(giftCard-25)+"$");
        }else if(purchase.equals("Hat")){
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: "+(giftCard-25)+"$");
        }else if(purchase.equals("Headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: "+(giftCard-30)+"$");
        }else if(purchase.equals("Laptop")){
            System.out.print("Sorry, not enough funds on your gift card!");
        }else if(purchase.equals("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: "+(giftCard-50)+"$");
        }else if(purchase.equals("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: "+(giftCard-40)+"$");
        }else if(purchase.equals("Smartphone")){
            System.out.print("Sorry, not enough funds on your gift card!");
        }else if(purchase.equals("Socks")){
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: "+(giftCard-5)+"$");
        }else if(purchase.equals("USB cable")){
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: "+(giftCard-10)+"$");
        }else{
            System.out.print("Invalid item!");
        }


    }
}
