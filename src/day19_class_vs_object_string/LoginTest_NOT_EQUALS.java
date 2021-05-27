package day19_class_vs_object_string;

public class LoginTest_NOT_EQUALS {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "CYBERTEK";
        String password = "Abc123";

        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user logged in successfully");
        } else {
            if (!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Fail - User name is incorrect");
        }else {
                System.out.println("Fail password is incorrect");
            }
        }

    }
}

