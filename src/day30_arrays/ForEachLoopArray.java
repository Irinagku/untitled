package day30_arrays;

import javax.lang.model.SourceVersion;

public class ForEachLoopArray {
    public static void main(String[] args) {
        //              0   1   2   3   4   5   6   7    8    9
        int[] data = {123, 23, 44, 12, 33, 55, 57, 112, 334, 555};

        for (int eachNum : data) {
            System.out.println(eachNum);
        }

        for (int n : data) {
            System.out.print(n + " ");
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        System.out.println("last value: " + data[data.length - 1]);

        // print all numbers backwards in same line
        for (int idx = data.length - 1; idx >= 0; idx--) {
            System.out.print(data[idx] + " ");
        }
    }
}