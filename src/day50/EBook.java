package day50;

public class EBook extends Book{
    int size;
    int pages;

    public void readBook(){
        System.out.println("Tanya is reading book: ");
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Pages = " + pages);
    }
}
