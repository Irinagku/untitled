package day24_loops;

public class YouTubeCats {
    public static void main(String[] args) throws InterruptedException {

        int seconds = 0;

        while(seconds<177){
            System.out.println("watching cat video" + seconds);
            seconds++;

        }
        System.out.println("Finished video");
        System.out.println("Lets start another one!");


        int count = 5;

        while(count>=0){
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("Done!");
    }
}
