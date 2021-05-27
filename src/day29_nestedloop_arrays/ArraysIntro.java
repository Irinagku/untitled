package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10; // single variable
        int[] nums = new int[3]; // array variable  /// 3 is the length, the size
        nums[0] = 5;  ///  0 is the index
        nums[1] = 10; // 1 is the index
        nums[2] = 7; // 2 is the index
        // print values of array
        System.out.println("value of index 0 = " + nums[0]);
        System.out.println("value of index 1 = " + nums[1]);
        System.out.println("value of index 2 = " + nums[2]);
        
        int i = 0;
        System.out.println(nums[i]);// will print 5
        i++;
        System.out.println(nums[i]); // will print 10

        // how to find the size of the array.
        System.out.println("number of elements = " + nums.length);


        int len = nums.length;
        System.out.println("len = " + len);



        //change the value of array:
        nums[0] = 100;
        nums[1] = 300;
        // read the value of index 1 and assign same to index 2
        nums[2] = nums[1];

        System.out.println("nums 1 = " + nums[0]);
        System.out.println("nums 2 = " + nums[1]);
        System.out.println("nums 3 = " + nums[2]);
    }
}
