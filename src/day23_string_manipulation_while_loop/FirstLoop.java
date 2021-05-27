package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {

        int i = 1;  // when  i = 10;  -- will not run , because 10 is bigger than 5 and its false
        while(i <= 5){
        System.out.println(i);
            System.out.println(i);
        i++;
    }

//************************************************************************************************************************
       //    int apples = 0;
        //   while(apples <= 10){
       //     System.out.println("apples -> " + apples);  /// running infinite times because it is true , never stops running
       //      }                                                 /// as long as condition is true it keeps running , red squar to stop running

 //*************************************************************************************************

        int apples1 = 0;
        while (apples1 <= 3){
            System.out.println("apples1 -> " + apples1);
            apples1++;
        }
        System.out.println("apples1 = " + apples1); // output 4 , it runs 3 times and adds 1 ( ++ ) 

}
}
