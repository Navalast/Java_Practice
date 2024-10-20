package oop.library.dto;

public class Book {

    private String title;
    private String author;
    private int year;
    private String isbn;
    private boolean available;

    public Book(String title, String author, int year, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", available=" + available +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
