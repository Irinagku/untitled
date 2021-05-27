package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        seatTheCar();
       shiftToDrive();
        pressGasPedal();
    }

    public static void pressGasPedal(){
        System.out.println("4. Hold steering wheel with 2 hands ");
    }

    public static void seatInCar() {
        System.out.println("1. Open the door and seat in driver seat");
    }

    public static void seatTheCar() {
        System.out.println("2. Insert key to ignition and turn clockwise");

    }

    public static void shiftToDrive(){
        System.out.println("3. Press brake and shift to 'D'");
    }
}