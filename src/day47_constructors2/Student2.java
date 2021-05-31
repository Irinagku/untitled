package day47_constructors2;

public class Student2 {
    private String name;
    private int age;
    //No_args constructors
    public Student2() {
        System.out.println("No-args constructor");
    }

    // constructor overloading with 1 param : String name
    public Student2(String name) {
        System.out.println("name param constructor | name = " + name);

    }

    // constructor with age
    public Student2(int age){
        System.out.println("age param constructor | age = " + age);
    }
    // constructor with name and age
    public Student2(String name, int age){
        System.out.println("age param constructor | " + name + " - " + age );
    }

}
