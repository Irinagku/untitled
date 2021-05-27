package OfficeHours;

public class Birds2 {
    public static void main(String[] args) {
         Birds birdOne = new Birds();
         Birds birdsTwo = new Birds();
         birdOne.setCanFly(true);
         System.out.println(birdsTwo.canFly());
         birdsTwo.setBeakLength(-1);
        System.out.println(birdsTwo.getBeakLength());
    }
}
