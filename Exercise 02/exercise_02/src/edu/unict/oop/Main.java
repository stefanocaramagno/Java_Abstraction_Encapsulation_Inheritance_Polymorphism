// PACKAGE
package edu.unict.oop;

// IMPORT
import edu.unict.oop.interfaces.Loanable;
import edu.unict.oop.interfaces.Sharable;
import edu.unict.oop.exceptions.LoanException;
import edu.unict.oop.exceptions.OvershareException;
import edu.unict.oop.exceptions.UnfeasableOperationException;
import edu.unict.oop.model.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inizio Programma!\n");

        User userA = new User("Mario", 1);
        User userB = new User("Giorgio", 2);

        PaperBook b1 = new PaperBook("Harry Potter", "J.K. Rowling", "10");
        Ebook b2 = new Ebook("The Lord of the Rings", "J.R.R. Tolkien", "15");
        PaperBook b3 = new PaperBook("The Hobbit", "J.R.R. Tolkien", "13");

        Book b4 = new PaperBook("Spiderman", "Stan Lee", "111");
        Book b5 = new Ebook("Topolino", "Paperone", "15");
        Book b6 = new PaperBook("Pluto", "Pippo", "13");

        try {
            userA.getShelf().addBook(b1);
            userA.getShelf().addBook(b2);
            userA.getShelf().addBook(b3);

            userB.getShelf().addBook(b4);
            userB.getShelf().addBook(b5);
            userB.getShelf().addBook(b6);

        } catch (UnfeasableOperationException ex){
            System.out.println(ex.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            Book b = userA.getShelf().findOneByAuthor("J.K. Rowling");
            if (b instanceof Loanable) {
                ((Loanable) b).lend(userB, LocalDate.now(), LocalDate.now().plusDays(1));
                System.out.println(b.toString() + " prestato");
            }
        } catch (LoanException | ClassCastException ex) {
            System.out.println(ex.getMessage());
        }

        //exception
        try {
            //prendiamo lo stesso libro e proviamo a ri-prestarlo
            Book b = userA.getShelf().findOneByAuthor("J.K. Rowling");
            if (b instanceof Loanable){
            ((Loanable) b).lend(userB, LocalDate.now(), LocalDate.now().plusDays(1));
            System.out.println(b);
            }
        } catch (LoanException | ClassCastException ex) {
            System.out.println(ex.getMessage());
        }

        // test sulla condivisione
        Book bx;
        try {

            bx = userB.getShelf().findOneByTitle("Topolino");
            if (bx instanceof Sharable) {
                ((Sharable) bx).share();
            }
            System.out.println("Libro "+ bx.toString() + " Condiviso");
            System.out.println("Numero di share del libro con isbn "+ bx.getIsbn() + ": " + ((Sharable) bx).getSharing());
        } catch (OvershareException | ClassCastException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("\nFine Programma!");        
    }
}