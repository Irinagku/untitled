package day13_conditional_statements;

/*
print "**** WELCOME TO TD BANK ATM ****"
secretPincode => ****
inputPincode => ****

if condition checks if secretPincode equals inputPincode
    true:
        "Welcome to your account."
        "You can withdraw, check balance, deposit"
    false:
        "Incorrect pincode! 1234"
        "Please try again."


print "Thank you for using TD Bank ATM!"
 */

public class ATMPIncodeProgram {
    public static void main(String[] args) {
        System.out.println("**** WELCOME TO TD BANK ATM ****");
        int secretPincode = 2233;
        int inputPincode = 2283;
        if(secretPincode==inputPincode){
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check balance, deposit");
        }else{
            System.out.println("Incorrect pincode!" +inputPincode );
            System.out.println("Please try again!");
        }

        System.out.println("Thank you for using TD Bank ATM!");
    }
}
