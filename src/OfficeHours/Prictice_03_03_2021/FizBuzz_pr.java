package OfficeHours.Prictice_03_03_2021;

public class FizBuzz_pr {
    public static void main(String[] args) {
        int num = 15;

        if( num %15 == 0){
            System.out.println(num + " FizBuz number");
        }else if( num %5 == 0){
            System.out.println(num + " Buz number");
        }else if( num %3== 0){
            System.out.println(num + " Fiz");
        }else{
            System.out.println(num + " is not Fiz or Buz number");
        }
    }
}
