package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("--------FIND THE INDEX OF 'Gloves' in items array ---------");

        // use for loop with condition
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break;
            }

        }

        System.out.println("---------Set boolean to true if first 'iPad' is found------------- ");

        boolean iPadExists = false;

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("iPad")) {
                iPadExists = true;
                break;


            }
            System.out.println("iPadExists = " + iPadExists);

            System.out.println("------Print a report of each shopping item--------");

            for (int s = 0; i < items.length; s++) {
                System.out.println(items[s] + " - $" + prices[s] + " -#" + itemIDs[s]);
                break;
            }
            System.out.println("----Look for 'Jacket' in items and print all details----");
            for (int b = 0; b < items.length; b++) {
                if (items[b].equalsIgnoreCase("Jacket")) {
                    System.out.println(items[b] + " $" + prices[b] + "  #" + itemIDs[b]);
                    break;
                }
            }
        }

    }
}