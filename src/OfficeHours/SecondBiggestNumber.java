package OfficeHours;
import java.util.*;
public class SecondBiggestNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,1,4,5,2,4,8,4,8};
        int max = nums[0];
        int secondMax = nums[0];

        for(int eachNum : nums){

            if (eachNum > max){
                max = eachNum;
            }
            if(eachNum > secondMax && eachNum < max){
                secondMax = eachNum;
            }
        }


    }
}
