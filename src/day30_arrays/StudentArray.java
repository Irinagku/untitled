package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String[] student1 = new String[5];
        student1[0] = "AD12345";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-2333";
        String [] student2 = {"MK322", "Mike", "Bloomerg", "B22", "443-214-3344"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 first name  = " + student1[1]);
        System.out.println("student1 last name = " + student1[2]);
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 mobile num = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        if (student1.length==5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has correct length");
        }

        if (student1.length==student2.length){
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data arrays length missmatch");
        }

      //  System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());     this way

        System.out.println((student1[1]+ " " + student1[2]).toUpperCase()); //   or this way with parenthesis
        String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));
    }
}
