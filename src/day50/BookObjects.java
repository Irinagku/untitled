package day50;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.00;

        System.out.println(book.title);
        System.out.println( book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.narrator = "Irina";
        audioBook.price = 44.99;
        audioBook.title = "Selenium CookBook";
        audioBook.type = "Autonation";
        audioBook.listen();

        EBook eBook  = new EBook();
        eBook.title = "Java data structure";
        eBook.author = "Savitch";
        eBook.type = "programming";
        eBook.price = 85.0;
        eBook.size = 2;
        eBook.pages = 1000;
        eBook.readBook();


    }
}
