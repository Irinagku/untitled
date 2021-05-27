package day25_loop__;

public class bananas_LOOP_ {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;

        while(isHungry){
            bananas++;
            System.out.println("Eating a banana: " +bananas);
            if(bananas == countToFull){
                isHungry = false;
            }
        }

        System.out.println("Had enough bananas, lets get back to studying");
    }
}
