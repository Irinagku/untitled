package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        //ERROR below,model and year are PRIVATE
       // car1.model = "Nissan Altima";
       // car1.year = 2020;

        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
       System.out.println("car1 year = " + car1.getYear());
        
        car1.setMileage(24000);
       System.out.println("car1 Mileage =  " + car1.getMileage());
        System.out.println(car1.toString());
        System.out.println("car1 = " + car1);

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);

        System.out.println("Model : " + alfaRomeo.getModel());
        System.out.println("Year : " + alfaRomeo.getYear());
        System.out.println("Mileage : " + alfaRomeo.getMileage());


    }
}
