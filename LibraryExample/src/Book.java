public class Book {
    private String ISBN;
    private String title;
    private String author;
    private String publisher;

    public Book(String ISBN, String title, String author, String publisher) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public String toString() {
        return ISBN + " " + title;
    }
}
