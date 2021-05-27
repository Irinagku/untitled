package day29_nestedloop_arrays;

public class MultiplicationTable_LOOPS {
    public static void main(String[] args) {

        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print(outer + "*" + inner + "=" + outer * inner + "\t");
            }
            System.out.println("");
        }


        for(int row = 1; row <= 3; row++){
            for(int col = 1; col <= 4; col++){
                System.out.print(row + "|" + col);
            }
        }



    }



}
