// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.interfaces.Sharable;
import edu.unict.oop.exceptions.OvershareException;

public class Ebook extends Book implements Sharable {

    // ATTRIBUTI
    private int sharing;
    
    // COSTRUTTORI    
    public Ebook(String title, String author, String isbn) {
        super(title, author, isbn);
        this.sharing = 0;
    }

    // toString
    @Override
    public String toString() {
        return "Ebook{" + "sharing=" + sharing + '}';
    }
       
    @Override
    public void share() throws OvershareException {
        if (this.sharing < MAXSHARING) {
            this.sharing++;
        } else {
            throw new OvershareException();
        }
    }

    @Override
    public void unshare() {
        if (this.sharing > 0) {
            this.sharing--;
        }
    }

    @Override
    public int getSharing() {
        return this.sharing;
    }
}
