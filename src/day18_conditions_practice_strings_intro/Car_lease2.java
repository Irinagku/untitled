package day18_conditions_practice_strings_intro;

public class Car_lease2 {
    public static void main(String[] args) {
        String make = "Audi";
        String model = "SQ5";
        double leasePrice = 552;

        if (make.equals("Audi")) {
            if (model.equals("SQ5")) {
                leasePrice = 552.00;
            } else if (model.equals("A3")) {
                leasePrice = 412.0;

            }
        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
    }


}

