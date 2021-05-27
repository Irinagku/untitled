package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 1111;
        int expLast4SSN = 2222;

        int pinCode = 3333;
        int expPinCode = 4444;

        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication unsuccessful");
            if (last4SSN != expLast4SSN) {
                System.out.println("last 4 SSN numbers incorrect");
            }
            if (expPinCode != pinCode) {
                System.out.println("Pin code is incorrect");
            }

        }
    }
}
