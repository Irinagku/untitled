package HomeworkPractice;

import java.util.Arrays;

public class Tanya {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 1, 11, 20, 5, 3, 8, 2, 8, 15};
        /**
         * sort only odd numbers descending
         * TODO:
         * 1. count how many odd numbers
         * 2. create new array with length == to count odd nums
         * 3.find odd numbers and add them to new array
         * 4.sort arr desc
         */
        int count = 0;
        for( int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0) {
                count++;

            }
        }
        int[] oddNums_arr = new int[count];

        int temp = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] % 2 != 0){
                oddNums_arr[temp] = arr[j];
                temp++;
            }
        }

        int[]sortDesArr = new int[oddNums_arr.length];
        int max = 0;
        int maxIndex = 0;
        for(int j = 0; j < sortDesArr.length; j++){
            for(int i = 0; i < oddNums_arr.length; i++){

                if (oddNums_arr[i] > max ){
                    max = oddNums_arr[i];
                    maxIndex = i;
                }
            }
            sortDesArr[j] = max;
            oddNums_arr[maxIndex] = 0;
            max = 0;
        }

        System.out.println(Arrays.toString(oddNums_arr));
        System.out.println(Arrays.toString(sortDesArr));











    }



}