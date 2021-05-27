package HomeworkPractice;

public class max {
    public static void main(String[] args){

        int [] nums = {7777, 9,0,11,66,44,88,999,44454};
        int maxNum = nums[0];
        int minNum = nums[0];

        for(int i=0; i<nums.length; i++){

            if( nums[i] > maxNum){
                maxNum = nums[i];
            }else if(nums[i] < minNum){
                minNum = nums[i];

            }
        }
        System.out.println(minNum);
        System.out.println(maxNum);

    }



}
