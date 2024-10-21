package oop.library.dto;

import oop.library.exceptions.BookException;

import java.util.LinkedList;
import java.util.List;

public class Library {
    private List<Book> books = new LinkedList<>();
    private List<Reader> readers = new LinkedList<>();


    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void removeBook(Book remBook) {
        this.books.remove(remBook);
    }

    public void registerReader(Reader newReader) {
        this.readers.add(newReader);
    }

    public void unregisterReader(Reader remReader) {
        this.readers.remove(remReader);
    }

    public void borrowBook(Reader reader, Book book) throws BookException {
        if (reader.getBookBorrowed().size() >= 4) {
            throw new BookException("Пользователь взял максимальное кол-во книг");
        }

        if (book.isAvailable()) {
            reader.getBookBorrowed().add(book);
            book.setAvailable(false);
        } else {
            throw new BookException("Эта книга уже выдана");
        }
    }

    public void returnBook(Reader reader, Book book) throws BookException {
        if (reader.getBookBorrowed().contains(book)) {
            reader.getBookBorrowed().remove(book);
            book.setAvailable(true);
        } else {
            throw new BookException("Такой книги нет у пользователя");
        }

    }

    public void getBooksInfo() {
        System.out.println("Список книг:");

        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void getReadersInfo() {
        System.out.println("Список читателей:");

        for (Reader r : readers) {
            System.out.println(r);
        }
    }

    public void getAvailableBooks() {
        boolean isHave = false;
        System.out.println("Список свободных книг: ");

        for (Book b : books) {
            if (b.isAvailable()) {
                System.out.println(b);
                isHave = true;
            }
        }

        if (!isHave) {
            System.out.println("Сейчас нет свободных книг");
        }
    }

    public void getBorrowedBooks() {
        boolean isHave = false;
        System.out.println("Список занятых книг:");

        for (Reader r : readers) {
            if (!r.getBookBorrowed().isEmpty()) {
                System.out.println(r.getBookBorrowed());
                isHave = true;
            }
        }

        if (!isHave) {
            System.out.println("Сейчас нет занятых книг");
        }
    }
}