import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int N_BOOKS = 100;
        int N_PATRONS = 25;
        Scanner f1 = new Scanner(new File("LibraryExample/names.txt"));
        Patron[] patrons = new Patron[N_PATRONS];
        int i = 0;
        while (f1.hasNext()) {
            String name = f1.next();
            patrons[i] = new Patron(name);
            System.out.println("Creating account for " + name);
            i++;
        }
        Book[] books = new Book[N_BOOKS];
        Scanner f2 = new Scanner(new File("LibraryExample/books.txt"));
        i = 0;
        while (f2.hasNext()) {
            String ISBN = f2.nextLine();
            String title = f2.nextLine();
            String author = f2.nextLine();
            String publisher = f2.nextLine();
            f2.nextLine();
            f2.nextLine();
            books[i] = new Book(ISBN, title, author, publisher);
            System.out.println("Creating book for " + title);
            i++;
        }
        Scanner f3 = new Scanner(new File("LibraryExample/library-transactions.txt"));
        i = 0;
        while (f3.hasNext()) {
            String[] splat = f3.nextLine().split(" ");
            String name = splat[0];
            String instr = splat[1];
            String ISBN = splat[2];
            for (int j = 0; j < N_PATRONS; j++) {
                if (patrons[j].getName().equals(name)) {
                    for (int k = 0; k < N_BOOKS; k++) {
                        if (books[k].getISBN().equals(ISBN)) {
                            if (instr.equals("borrowed")) {
                                if (patrons[j].borrowBook(books[k])) System.out.println(name + " borrowed " + books[k].toString());
                                else System.out.println(name + " could not borrow " + books[k].toString());
                            } else {
                                if (patrons[j].returnBook(books[k])) System.out.println(name + " returned " + books[k].toString());
                                else System.out.println(name + " could not return " + books[k].toString());
                                patrons[j].returnBook(books[k]);
                            }
                        }
                    }
                }
            }
        }

        for (i = 0; i < N_PATRONS; i++) {
            patrons[i].printBooksOnLoan();
        }
    }
}