package lt.sdacademy.fundamentals.object_oriented.classes10;

public class BookTester {

    public static void main(String[] args) {
        Book book = new Book(new Author("Tom", 15), "Nice book");
        System.out.println(book.author.name);
    }
}
