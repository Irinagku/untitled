package day17_ternary_nested_conditions;
/*
itemPrice = 30;
isPrimeMember = true;

when isPrimeMember is true
    print "Eligible for free 2 day shipping"
otherwise
    when itemPrice is more than 25
        print "Eligible for free regular shipping"
    otherwise
        print "Not eligible for free shipping. fee is $10"
 */

public class AmazonPrimeShopping {
    public static void main(String[] args) {

        double price = 45;
        boolean isPrimeMember = true;


        if(isPrimeMember){
            System.out.println("Eligible for free 2 day shipping eligible");
            }else{
                if(price >=25.0){
                    System.out.println("Eligible for free regular shipping");
                }else{
                    System.out.println("Not eligible for fre shipping");
                }
            }


    }




}
