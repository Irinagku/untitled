package day26_loops;

public class loop_lebgth {
    public static void main(String[] args) {

        String word = "cellphone";

        for(int i = word.length()-1; i >=0; i--){
            System.out.println(i + " - " + word.charAt(i));
        }
    }
}
