package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        double leasePrice = 500;

        if(make.equals("Mercedes")){
            if(model.equals("E")) {
                leasePrice = 500.00;
            }else if (model.equals("A")){
                leasePrice = 400.0;

            }
        }




        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
    }


}
