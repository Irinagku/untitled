package OfficeHours;

import java.util.ArrayList;

public class Nanuk_05_11_21 {

        public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {

            int foodFound = 0;

            for(String each : r){

                if(each.equals("nanuk")){
                    way_stones--;
                } else {
                    foodFound += Integer.parseInt(each);
                }

            }

            return way_stones >= 0 && foodFound >= boast;
    }
}
