package HomeworkPractice;

public class printing_1_100_without_loop {
    public static void main(String[] args) {
        int i = 100;
        System.out.println("Displaying from1 to 100: ");
        display(i);
    }

    private static void display(int i) {
        if (i > 1)
            display(i - 1);
        System.out.print(i + " ");
    }
}
