package HomeworkPractice;
import java.util.*;
public class Zoom_04_01 {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefhhgdueueisjshdhdfuyrurh625535&&&^%$$%";
        Random random = new Random();
        String password = "";

        for (int i = 1; i <= 8; i++) {
             int index = random.nextInt(71);
            System.out.print(source.charAt(index));
           password += source.charAt(index);
        }
        System.out.println("\nYour password = " + password);

    }


}