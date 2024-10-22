package oop.library.dto;

import java.util.LinkedList;
import java.util.List;

public class Reader {

    private String firstName;
    private String lastName;
    private String libraryCardNumber;
    private List<Book> bookBorrowed = new LinkedList<>();

    public Reader(String firstName, String lastName, String libraryCardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.libraryCardNumber = libraryCardNumber;
    }

    public List<Book> getBookBorrowed() {
        return bookBorrowed;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "bookBorrowed=" + bookBorrowed +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", libraryCardNumber='" + libraryCardNumber + '\'' +
                '}';
    }
}