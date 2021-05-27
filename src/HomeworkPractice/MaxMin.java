package HomeworkPractice;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
         int[] nums = {11,55,44,88,44,99};
        System.out.println(Arrays.toString(nums));

        int maxNum = nums[0];
        int indexMax = 0;
        for(int i = 0; i<nums.length; i++){
            if( nums [i] > indexMax){
                maxNum = nums[i];
                indexMax = i;
            }
        }
        System.out.println("the biggest number is: " + maxNum);
    }
}
