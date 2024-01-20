public class Patron {
    private String name;
    private Book books[];
    private int booksOnLoan;

    public Patron(String name) {
        this.name = name;
        this.books = new Book[3];
        booksOnLoan = 0;
    }


    public boolean borrowBook(Book b) {
        if (this.booksOnLoan < 3) {
            books[booksOnLoan] = b;
            booksOnLoan++;
            return true;
        }
        return false;
    }

    public boolean returnBook(Book b) {
        for (int i = 0; i < this.booksOnLoan; i++) {
            if (books[i] != null && books[i].equals(b)) {
                this.booksOnLoan--;
                books[i] = null;
                for (int j = i + 1; j < this.booksOnLoan; j++) {
                    books[j] = books[j + 1];
                }
                books[this.booksOnLoan] = null;
                return true;
            }
        }
        return false;
    }
    public int getBooksOnLoan() {
        return this.booksOnLoan;
    }

    public void printBooksOnLoan() {
        System.out.println("Person " + this.name + " has these books:");
        for (int i = 0; i < 3; i++) {
            if (this.books[i] != null)
                System.out.println(books[i].toString());
        }
    }

    public String getName() {
        return this.name;
    }
}
