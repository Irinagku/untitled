package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(23, 45, 66, 45, 22, 88, 56, 55, 43, 6, 6, 8, 99, 9, 23, 67);
        addNumbers();
    }
    public static void addNumbers(int... nums){ // three dots ... work only inside as a method parameter, not outside
        int sum = 0;
        for(int n  : nums){
            sum += n;
            
        }
        System.out.println("sum = " + sum);
    }
}
