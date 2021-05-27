package day40_arraylist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println("size = " + nums.size() );

        nums.add(34); nums.add(5); nums.add(3); nums.add(44);
        nums.add(500); nums.add(45); nums.add(68); nums.add(87);

        System.out.println("nums = " + nums);

        nums.remove(0);

        System.out.println("nums = " + nums);

        nums.remove(new Integer(34));
        System.out.println("nums = " + nums);
        
        nums.remove(new Integer(5));
        System.out.println("nums = " + nums);

        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }

        for( int each : nums){
            System.out.println(each + " ");
        }


    }
}
