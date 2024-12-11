// PACKAGE
package edu.unict.oop.model;

// IMPORT
import java.util.Objects;

public abstract class Book {
    
    // ATTRIBUTI
    private final String title;
    private String author;
    private String isbn;

    // COSTRUTTORI
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    // GETTER
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
    
    // toString
    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", isbn=" + isbn + '}';
    }
   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.author);
        hash = 41 * hash + Objects.hashCode(this.title);
        hash = 41 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Book)) {
            return false;
        }
        final Book other = (Book) obj;
        //all three conditions must be true
        return Objects.equals(this.author, other.author)
                && Objects.equals(this.title, other.title)
                && Objects.equals(this.isbn, other.isbn);
    }
}
