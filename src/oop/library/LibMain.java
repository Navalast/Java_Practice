package oop.library;

import oop.library.dto.Book;
import oop.library.dto.Library;
import oop.library.dto.Reader;
import oop.library.exceptions.BookException;

public class LibMain {
    public static void main(String[] args) throws BookException {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "9780743273565", true);
        Book book2 = new Book("1984", "George Orwell", 1949, "9780451524935", true);

        Reader john = new Reader("John", "Doe", "123456789");
        Reader jane = new Reader("Jane", "Doe", "987654321");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        library.getBooksInfo();

        System.out.println("-----------------");

        library.registerReader(john);
        library.registerReader(jane);

        library.getReadersInfo();

        library.borrowBook(john, book1);
        library.borrowBook(jane, book2);

        System.out.println("-----------------");

        library.getBooksInfo();

        System.out.println("-----------------");

        library.getAvailableBooks();

        library.returnBook(john, book1);
        library.returnBook(jane, book2);

        System.out.println("-----------------");
        library.getAvailableBooks();

        System.out.println("-----------------");
        library.getBorrowedBooks();
    }
}