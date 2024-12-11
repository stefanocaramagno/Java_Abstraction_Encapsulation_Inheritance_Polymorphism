// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.exceptions.UnfeasableOperationException;
import java.util.LinkedList;
import java.util.List;

public class BookShelf {

    // ATTRIBUTI
    private final List<Book> shelf;

    // COSTRUTTORI
    public BookShelf(List<Book> shelf) {
        this.shelf = shelf;
    }

    public BookShelf() {
        shelf = new LinkedList<>();
    }
    
    // GETTER
    public List<Book> getShelf() {
        return shelf;
    }
    
    // toString
    @Override
    public String toString() {
        return "BookShelf{" + "shelf=" + shelf + '}';
    }

    // Metodo per Aggiungere un nuovo libro in Archivio
    public void addBook(Book book) throws UnfeasableOperationException {
        if (shelf.contains(book)) {
            System.out.println("Book" + book.getIsbn() + "already present in the shelf");
            throw new UnfeasableOperationException("Book already present in the shelf");
        }
        shelf.add(book);
    }
    
    // Metodo per Rimuovere un libro dall'Archivio
    public void removeBook(Book book) throws UnfeasableOperationException {
        if (!shelf.remove(book)) {
            String msg = "Book" + book.getIsbn() + "not present in the shelf";
            throw new UnfeasableOperationException(msg);
        }
    }
    
    // Metodo di Ricerca di un libro all'interno della collezione per Autore
    public List<Book> findAllByAuthor(String author){
        List<Book> foundBook = new LinkedList<>();
        for (Book book: shelf)
            if (book.getAuthor().equals(author))
                foundBook.add(book);
        return foundBook;
    }

    // Metodo di Ricerca di un libro all'interno della collezione per Titolo
    public List<Book> findAllByTitle(String title){
        List<Book> foundBook= new LinkedList<>();
        for (Book book: shelf)
            if (book.getTitle().equals(title))
                foundBook.add(book);
        return foundBook;
    }
    
    // Metodo di Ricerca di un libro all'interno della collezione per Autore 
    // (resistuendo il primo libro trovato)
    public Book findOneByAuthor(String author){
        if (author==null) throw new NullPointerException();
        for (Book book: shelf)
            if (book.getAuthor().equals(author))
                return book;
        return null;
    }

    // Metodo di Ricerca di un libro all'interno della collezione per Autore 
    // (resistuendo il primo indice di posizione trovato) 
    public Book findOneByTitle(String title){
        if (title==null) throw new NullPointerException();
        for (Book book: shelf)
            if (book.getTitle().equals(title))
                return book;
        return null;
    }    
    
    public int search(Book book){
        return shelf.indexOf(book); // in List returns the index of the first occurrence of the specified book in this list,
        //or -1 if this list does not contain the book.
        // nel nostro caso se c'è book è unico
    }


}
