package day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? = " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep ");
        }else{
            System.out.println("List is not empty, code java then goto mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("glasses");
        shoppingList.add("hat");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep ");
        }else{
            System.out.println("List is not empty, code java then go to mall");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));

        if(shoppingList.contains("shoes")){
            System.out.println("Shoes is in the list");
        }else{
            System.out.println("Buying shoes ....$80");

            shoppingList.remove("shoes");

            System.out.println("list = " + shoppingList);

            System.out.println("Done shopping, get back to coding");
            shoppingList.clear(); // clear the list
            System.out.println(shoppingList);
        }

    }

}
